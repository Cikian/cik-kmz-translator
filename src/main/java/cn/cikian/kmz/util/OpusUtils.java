package cn.cikian.kmz.util;


import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.UUID;

import static cn.cikian.kmz.util.RouteFileUtils.getSafePath;

/**
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-06-04 02:01
 */
@Slf4j
public class OpusUtils {

    private static final int OPUS_APPLICATION_AUDIO      = 2049;
    private static final int OPUS_SET_BITRATE_REQUEST    = 4002;
    private static final int OPUS_SET_VBR_REQUEST        = 4006;
    private static final int OPUS_SET_COMPLEXITY_REQUEST = 4010;
    private static final int OPUS_SET_SIGNAL_REQUEST     = 4024;
    private static final int OPUS_SET_DTX_REQUEST        = 4016;
    private static final int OPUS_SIGNAL_VOICE           = 3001;

    // 按文档：16kHz, mono, 40ms帧, 32kbps CBR
    // 40ms @ 16000Hz = 640 samples；32kbps / 25fps = 160 bytes/帧
    private static final int SAMPLE_RATE    = 16000;
    private static final int CHANNELS       = 1;
    private static final int FRAME_SAMPLES  = 640;               // 40ms
    private static final int FRAME_BYTES    = FRAME_SAMPLES * 2; // s16le = 1280 bytes 输入
    private static final int PACKET_SIZE    = 160;               // 编码输出固定 160 字节

    public interface LibOpus extends Library {
        LibOpus INSTANCE = Native.load("opus", LibOpus.class);
        Pointer opus_encoder_create(int Fs, int channels, int application, Pointer error);
        int     opus_encode(Pointer st, short[] pcm, int frame_size, byte[] data, int max_data_bytes);
        void    opus_encoder_ctl(Pointer st, int request, int value);
        void    opus_encoder_destroy(Pointer st);
    }

    public static boolean convert2Opus(String oPath, String opusPath) throws Exception {
        NativeLoader.loadOpusLibrary();

        String pcmTemp = getSafePath() + File.separator + UUID.randomUUID() + ".pcm";

        try {
            // Step 1: FFmpeg 转 PCM（16kHz, mono, s16le）
            String cmd = String.format(
                    "ffmpeg -y -i \"%s\" -ar %d -ac %d -f s16le \"%s\"",
                    oPath, SAMPLE_RATE, CHANNELS, pcmTemp
            );
            Process p = Runtime.getRuntime().exec(cmd);
            if (p.waitFor() != 0) throw new RuntimeException("FFmpeg 预处理失败");

            // Step 2: 初始化 Opus 编码器
            Pointer encoder = LibOpus.INSTANCE.opus_encoder_create(
                    SAMPLE_RATE, CHANNELS, OPUS_APPLICATION_AUDIO, null
            );
            if (encoder == null) throw new RuntimeException("Opus 编码器初始化失败");

            LibOpus.INSTANCE.opus_encoder_ctl(encoder, OPUS_SET_BITRATE_REQUEST,    32000); // 32kbps
            LibOpus.INSTANCE.opus_encoder_ctl(encoder, OPUS_SET_VBR_REQUEST,        0);     // CBR
            LibOpus.INSTANCE.opus_encoder_ctl(encoder, OPUS_SET_COMPLEXITY_REQUEST, 8);
            LibOpus.INSTANCE.opus_encoder_ctl(encoder, OPUS_SET_SIGNAL_REQUEST,     OPUS_SIGNAL_VOICE);
            LibOpus.INSTANCE.opus_encoder_ctl(encoder, OPUS_SET_DTX_REQUEST,        0);

            try (FileInputStream fis = new FileInputStream(pcmTemp);
                 FileOutputStream fos = new FileOutputStream(opusPath)) {

                byte[] inBuf = new byte[FRAME_BYTES]; // 1280 字节输入缓冲
                byte[] out   = new byte[PACKET_SIZE * 2]; // 给编码器留余量
                int bytesRead;

                while ((bytesRead = fis.read(inBuf)) != -1) {
                    // 末尾不足一帧时补零
                    if (bytesRead < FRAME_BYTES) {
                        Arrays.fill(inBuf, bytesRead, FRAME_BYTES, (byte) 0);
                    }

                    // 字节数组 → short[] (小端序)
                    short[] pcm = new short[FRAME_SAMPLES];
                    for (int i = 0; i < FRAME_SAMPLES; i++) {
                        pcm[i] = (short) ((inBuf[2 * i + 1] << 8) | (inBuf[2 * i] & 0xFF));
                    }

                    // Step 3: 编码
                    int len = LibOpus.INSTANCE.opus_encode(encoder, pcm, FRAME_SAMPLES, out, out.length);
                    if (len < 0) throw new RuntimeException("Opus 编码失败，错误码: " + len);

                    // 写固定 160 字节：不足时用 0x00 填充（文档要求）
                    if (len >= PACKET_SIZE) {
                        fos.write(out, 0, PACKET_SIZE);
                    } else {
                        fos.write(out, 0, len);
                        byte[] padding = new byte[PACKET_SIZE - len];
                        fos.write(padding);
                    }
                }
            } finally {
                LibOpus.INSTANCE.opus_encoder_destroy(encoder);
            }
        } finally {
            Files.deleteIfExists(Paths.get(pcmTemp));
        }

        log.info("音频文件转换完成: {}", opusPath);
        return true;
    }

    /**
     * 将源音频文件转换为 PCM 格式（16kHz, 单声道, s16le）
     *
     * @param oPath    源音频文件路径 (例如 .mp3, .wav)
     * @param pcmPath  目标 PCM 文件输出路径
     * @return 转换成功返回 true
     * @throws Exception 当 FFmpeg 执行失败或发生输入输出异常时抛出
     */
    public static boolean convert2Pcm(String oPath, String pcmPath) throws Exception {
        // 确保目标输出目录存在
        File pcmFile = new File(pcmPath);
        File parentFile = pcmFile.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }

        // 构造 FFmpeg 命令：转为 16kHz、单声道、s16le 格式的 PCM
        // -y 表示如果目标文件已存在则直接覆盖
        String cmd = String.format(
                "ffmpeg -y -i \"%s\" -ar %d -ac %d -f s16le \"%s\"",
                oPath, SAMPLE_RATE, CHANNELS, pcmPath
        );

        log.info("开始执行 FFmpeg 音频转换命令: {}", cmd);

        Process p = null;
        try {
            p = Runtime.getRuntime().exec(cmd);
            int exitCode = p.waitFor();

            if (exitCode != 0) {
                log.error("FFmpeg 转换失败，退出码: {}", exitCode);
                throw new RuntimeException("FFmpeg 预处理失败，退出码: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            log.error("FFmpeg 执行期间发生异常", e);
            // 发生异常时，清理可能生成的未完整写入的损坏文件
            try {
                Files.deleteIfExists(Paths.get(pcmPath));
            } catch (IOException ignored) {}

            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            throw e;
        } finally {
            if (p != null) {
                p.destroy();
            }
        }

        log.info("音频文件转换为 PCM 完成: {}", pcmPath);
        return true;
    }
}

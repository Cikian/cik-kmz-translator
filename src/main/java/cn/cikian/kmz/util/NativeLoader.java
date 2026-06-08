package cn.cikian.kmz.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-06-04 01:59
 */
public class NativeLoader {
    private static boolean isLoaded = false;

    public static synchronized void loadOpusLibrary() {
        if (isLoaded) return;

        String os = System.getProperty("os.name").toLowerCase();
        boolean isWindows = os.contains("win");

        String libName = isWindows ? "opus.dll" : "libopus.so";
        String resourcePath = "/native/" + (isWindows ? "win-x64/" : "linux-x64/") + libName;

        // 修改：指定 Home 目录下的隐藏文件夹
        File homeDir = new File(System.getProperty("user.home"), ".kmz_libs");
        if (!homeDir.exists()) homeDir.mkdirs();
        File libFile = new File(homeDir, libName);

        try {
            // 修改：如果文件已存在，则直接跳过复制，执行加载
            if (!libFile.exists()) {
                InputStream is = NativeLoader.class.getResourceAsStream(resourcePath);
                if (is == null) {
                    throw new FileNotFoundException("找不到动态库文件: " + resourcePath);
                }
                Files.copy(is, libFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }

            // 加载已存在或刚复制好的库
            System.load(libFile.getAbsolutePath());
            isLoaded = true;
        } catch (IOException e) {
            throw new RuntimeException("动态库处理失败: " + e.getMessage(), e);
        }
    }
}

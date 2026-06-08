package cn.cikian.kmz.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
@Data
public class PointActionReq implements Serializable {

    /**
     * 动作编号
     */
    private Integer actionIndex;

    /**
     * 飞行器悬停等待时间
     */
    private Double hoverTime;

    /**
     * 飞行器目标偏航角
     */
    private Double aircraftHeading;

    /**
     * 普通拍照：0，全景拍照：1
     */
    private Integer takePhotoType;

    /**
     * 是否使用全局拍照模式 0：不使用 1：使用
     */
    private Integer useGlobalImageFormat;

    /**
     * 拍照模式（字典）
     */
    private String imageFormat;

    /**
     * 拍摄照片文件后缀
     */
    private String fileSuffix;


    /**
     * 云台偏航角
     */
    private Double gimbalYawRotateAngle;

    /**
     * 云台俯仰角
     */
    private Double gimbalPitchRotateAngle;

    /**
     * 变焦焦距
     */
    private Double zoom;

    /**
     * 开始录像
     */
    private Boolean startRecord;

    /**
     * 停止录像
     */
    private Boolean stopRecord;

    /**
     * 喊话内容
     */
    private String ttsText;

    /**
     * 喊话音色 male
     */
    private String ttsRole;

    /**
     * 语言 CN
     */
    private String ttsLanguage;

    /**
     * 音量
     */
    private Integer ttsVolume;

    /**
     * 语速
     */
    private Integer ttsSpeed;

    /**
     * 喊话开关 0-开始喊话 1-结束喊话
     */
    private Integer megaphoneOperateType;

    /**
     * 喊话音量大小 [0, 100]
     */
    private Integer megaphoneOperateVolume;

    /**
     * 是否单曲循环播放 0-关闭 1-开启
     */
    private Integer megaphoneOperateLoop;

    /**
     * 喊话音频文件url
     */
    private String megaphoneFileUrl;

    /**
     * 喊话显示名称
     */
    private String megaphoneFileOriginalName;

    /**
     * 	探照灯操作类型 0-关闭 1-照明 2-爆闪
     */
    private Integer searchlightOperateType;

    /**
     * 	亮度 [0, 100]
     */
    private Integer searchlightBrightness;



}

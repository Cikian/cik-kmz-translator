package cn.cikian.kmz.domain.kml;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
@Data
@XStreamAlias("wpml:actionActuatorFuncParam")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KmlActionActuatorFuncParam {

    // takePhoto & startRecord & stopRecord

    @XStreamAlias("wpml:payloadPositionIndex")
    private String payloadPositionIndex;

    @XStreamAlias("wpml:fileSuffix")
    private String fileSuffix;

    @XStreamAlias("wpml:payloadLensIndex")
    private String payloadLensIndex;

    @XStreamAlias("wpml:useGlobalPayloadLensIndex")
    private String useGlobalPayloadLensIndex;

    // focus

    @XStreamAlias("wpml:isPointFocus")
    private String isPointFocus;

    @XStreamAlias("wpml:focusX")
    private String focusX;

    @XStreamAlias("wpml:focusY")
    private String focusY;

    @XStreamAlias("wpml:focusRegionWidth")
    private String focusRegionWidth;

    @XStreamAlias("wpml:focusRegionHeight")
    private String focusRegionHeight;

    @XStreamAlias("wpml:isInfiniteFocus")
    private String isInfiniteFocus;

    // zoom

    @XStreamAlias("wpml:focalLength")
    private String focalLength;

    // customDirName

    @XStreamAlias("wpml:directoryName")
    private String directoryName;

    // gimbalRotate & gimbalEvenlyRotate

    @XStreamAlias("wpml:gimbalHeadingYawBase")
    private String gimbalHeadingYawBase;

    @XStreamAlias("wpml:gimbalRotateMode")
    private String gimbalRotateMode;

    @XStreamAlias("wpml:gimbalPitchRotateEnable")
    private String gimbalPitchRotateEnable;

    @XStreamAlias("wpml:gimbalPitchRotateAngle")
    private String gimbalPitchRotateAngle;

    @XStreamAlias("wpml:gimbalRollRotateEnable")
    private String gimbalRollRotateEnable;

    @XStreamAlias("wpml:gimbalRollRotateAngle")
    private String gimbalRollRotateAngle;

    @XStreamAlias("wpml:gimbalYawRotateEnable")
    private String gimbalYawRotateEnable;

    @XStreamAlias("wpml:gimbalYawRotateAngle")
    private String gimbalYawRotateAngle;

    @XStreamAlias("wpml:gimbalRotateTimeEnable")
    private String gimbalRotateTimeEnable;

    @XStreamAlias("wpml:gimbalRotateTime")
    private String gimbalRotateTime;

    // rotateYaw

    @XStreamAlias("wpml:aircraftHeading")
    private String aircraftHeading;

    @XStreamAlias("wpml:aircraftPathMode")
    private String aircraftPathMode;

    // hover

    @XStreamAlias("wpml:hoverTime")
    private String hoverTime;

    // orientedShoot

    @XStreamAlias("wpml:accurateFrameValid")
    private String accurateFrameValid;

    @XStreamAlias("wpml:targetAngle")
    private String targetAngle;

    @XStreamAlias("wpml:actionUUID")
    private String actionUUID;

    @XStreamAlias("wpml:imageWidth")
    private String imageWidth;

    @XStreamAlias("wpml:imageHeight")
    private String imageHeight;

    @XStreamAlias("wpml:AFPos")
    private String AFPos;

    @XStreamAlias("wpml:gimbalPort")
    private String gimbalPort;

    @XStreamAlias("wpml:orientedCameraType")
    private String orientedCameraType;

    @XStreamAlias("wpml:orientedFilePath")
    private String orientedFilePath;

    @XStreamAlias("wpml:orientedFileMD5")
    private String orientedFileMD5;

    @XStreamAlias("wpml:orientedFileSize")
    private String orientedFileSize;

    @XStreamAlias("wpml:orientedFileSuffix")
    private String orientedFileSuffix;

    @XStreamAlias("wpml:orientedCameraApertue")
    private String orientedCameraApertue;

    @XStreamAlias("wpml:orientedCameraLuminance")
    private String orientedCameraLuminance;

    @XStreamAlias("wpml:orientedCameraShutterTime")
    private String orientedCameraShutterTime;

    @XStreamAlias("wpml:orientedCameraISO")
    private String orientedCameraISO;

    @XStreamAlias("wpml:orientedPhotoMode")
    private String orientedPhotoMode;

    // panoShot

    @XStreamAlias("wpml:panoShotSubMode")
    private String panoShotSubMode;

    // recordPointCloud

    @XStreamAlias("wpml:recordPointCloudOperate")
    private String recordPointCloudOperate;

    // megaphone & searchlight

    @XStreamAlias("wpml:megaphoneOperateType")
    private String megaphoneOperateType;

    @XStreamAlias("wpml:megaphoneOperateVolume")
    private String megaphoneOperateVolume;

    @XStreamAlias("wpml:megaphoneOperateLoop")
    private String megaphoneOperateLoop;

    @XStreamAlias("wpml:megaphoneOperateFilePath")
    private String megaphoneOperateFilePath;

    @XStreamAlias("wpml:megaphoneFileName")
    private String megaphoneFileName;

    @XStreamAlias("wpml:megaphoneFileOriginalName")
    private String megaphoneFileOriginalName;

    @XStreamAlias("wpml:megaphoneFileMd5")
    private String megaphoneFileMd5;

    @XStreamAlias("wpml:megaphoneFileBitrate")
    private String megaphoneFileBitrate;

    @XStreamAlias("ttsparam")
    private TtsParam ttsparam;

    @XStreamAlias("wpml:searchlightOperateType")
    private String searchlightOperateType;

    @XStreamAlias("wpml:searchlightBrightness")
    private String searchlightBrightness;

    @XStreamAlias("wpml:searchlightLightingType")
    private String searchlightLightingType;


}

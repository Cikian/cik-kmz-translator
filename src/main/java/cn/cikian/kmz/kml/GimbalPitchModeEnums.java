package cn.cikian.kmz.kml;

/**
 * wpml:gimbalPitchMode	 云台俯仰角控制模式
 *
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
public enum GimbalPitchModeEnums {

    MANUAL("manual", "手动控制"),
    USE_POINT_SETTING("usePointSetting", "依照每个航点设置");

    private String value;
    private String description;

    GimbalPitchModeEnums(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

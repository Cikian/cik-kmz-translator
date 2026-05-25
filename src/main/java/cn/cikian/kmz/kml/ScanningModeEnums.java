package cn.cikian.kmz.kml;

/**
 * wpml:scanningMode		 负载扫描模式
 *
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
public enum ScanningModeEnums {

    REPETITIVE("repetitive", "重复扫描"),
    NON_REPETITIVE("nonRepetitive", "非重复扫描");

    private String value;
    private String description;

    ScanningModeEnums(String value, String description) {
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

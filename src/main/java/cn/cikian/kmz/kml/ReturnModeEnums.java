package cn.cikian.kmz.kml;

/**
 * wpml:returnMode		 激光雷达回波模式
 *
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
public enum ReturnModeEnums {

    SINGLE_RETURN_STRONGEST("singleReturnStrongest", "单回波"),
    DUAL_RETURN("dualReturn", "双回波"),
    TRIPLE_RETURN("tripleReturn", "三回波");

    private String value;
    private String description;

    ReturnModeEnums(String value, String description) {
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

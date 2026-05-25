package cn.cikian.kmz.kml;

/**
 * wpml:executeRCLostAction	 失控动作类型
 * 当 wpml:exitOnRCLost为 executeLostAction 时为必需元素
 *
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
public enum ExecuteRCLostActionEnums {

    GO_BACK("goBack", "返航"),
    LANDING("landing", "降落"),
    HOVER("hover", "悬停");

    private String value;
    private String description;

    ExecuteRCLostActionEnums(String value, String description) {
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

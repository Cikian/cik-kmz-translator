package cn.cikian.kmz.kml;

/**
 * wpml:exitOnRCLost 失控是否继续执行航线
 *
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
public enum ExitOnRCLostEnums {

    GO_CONTINUE("goContinue", "继续执行航线"),
    EXECUTE_LOST_ACTION("executeLostAction", "退出航线，执行失控动作");

    private String value;
    private String description;

    ExitOnRCLostEnums(String value, String description) {
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

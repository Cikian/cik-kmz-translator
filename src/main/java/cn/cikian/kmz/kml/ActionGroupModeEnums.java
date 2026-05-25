package cn.cikian.kmz.kml;

/**
 * wpml:actionGroupMode	 动作执行模式
 *
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
public enum ActionGroupModeEnums {

    //    MANUAL("manual", "手动控制"),
    SEQUENCE("sequence", "串行执行。即动作组内的动作依次按顺序执行");

    private String value;
    private String description;

    ActionGroupModeEnums(String value, String description) {
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

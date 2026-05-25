package cn.cikian.kmz.kml;

/**
 * wpml:overlap	 采集类型
 *
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
public enum CollectionMethodEnums {

    ORTHO("ortho", "正射采集"),
    INCLINED("inclined", "倾斜采集");

    private String value;
    private String description;

    CollectionMethodEnums(String value, String description) {
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

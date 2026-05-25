package cn.cikian.kmz.constant;

/**
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
public interface FileTypeConstants {

    /**
     * kmz 文件本质上是zip文件
     */
    String KMZ = "zip";

    /**
     * kml 文件
     */
    String KML = "kml";

    /**
     * wpml 文件
     */
    String WPML = "wpml";

    /**
     * 航线导入支持的文件类型
     */
    String ROUTE_SUPPORT_TYPE = "kml,zip";
}

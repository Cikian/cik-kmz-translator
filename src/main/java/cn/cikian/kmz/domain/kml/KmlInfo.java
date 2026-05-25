package cn.cikian.kmz.domain.kml;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Data;

/**
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
@Data
@XStreamAlias("kml")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KmlInfo {

    @XStreamAsAttribute
    @XStreamAlias("xmlns")
    private String xmlns = "http://www.opengis.net/kml/2.2";

    @XStreamAsAttribute
    @XStreamAlias("xmlns:wpml")
    private String wpml = "http://www.dji.com/wpmz/1.0.6";

    @XStreamAlias("Document")
    private KmlDocument document;

}

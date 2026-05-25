package cn.cikian.kmz.domain.kml;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.List;

/**
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
@Data
@XStreamAlias("wpml:actionGroup")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KmlActionGroup {

    @XStreamAlias("wpml:actionGroupId")
    private String actionGroupId;

    @XStreamAlias("wpml:actionGroupStartIndex")
    private String actionGroupStartIndex;

    @XStreamAlias("wpml:actionGroupEndIndex")
    private String actionGroupEndIndex;

    @XStreamAlias("wpml:actionGroupMode")
    private String actionGroupMode;

    @XStreamAlias("wpml:actionTrigger")
    private KmlActionTrigger actionTrigger;

    @XStreamAlias("wpml:action")
    private List<KmlAction> action;


}

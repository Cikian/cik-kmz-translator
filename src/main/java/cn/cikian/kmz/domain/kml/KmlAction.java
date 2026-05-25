package cn.cikian.kmz.domain.kml;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
@Data
@XStreamAlias("wpml:action")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KmlAction {

    @XStreamAlias("wpml:actionId")
    private String actionId;

    @XStreamAlias("wpml:actionActuatorFunc")
    private String actionActuatorFunc;

    @XStreamAlias("wpml:actionActuatorFuncParam")
    private KmlActionActuatorFuncParam actionActuatorFuncParam;


}

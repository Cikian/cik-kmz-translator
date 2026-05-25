package cn.cikian.kmz.domain.kml;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * 坐标系参数
 *
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
@Data
@XStreamAlias("wpml:waylineCoordinateSysParam")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KmlWayLineCoordinateSysParam {

    @XStreamAlias("wpml:coordinateMode")
    private String coordinateMode;

    @XStreamAlias("wpml:heightMode")
    private String heightMode;

    @XStreamAlias("wpml:positioningType")
    private String positioningType;

    @XStreamAlias("wpml:globalShootHeight")
    private String globalShootHeight;

    @XStreamAlias("wpml:surfaceFollowModeEnable")
    private String surfaceFollowModeEnable;

    @XStreamAlias("wpml:surfaceRelativeHeight")
    private String surfaceRelativeHeight;

}

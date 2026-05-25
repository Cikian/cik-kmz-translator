package cn.cikian.kmz.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
@Data
public class WaypointTurnReq implements Serializable {

    /**
     * 航点转弯模式
     */
    private String waypointTurnMode;

    /**
     * 航点转弯截距
     */
    private Double waypointTurnDampingDist;

    /**
     * 该航段是否贴合直线
     */
    private Integer useStraightLine;


}

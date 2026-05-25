package cn.cikian.kmz.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
@Data
public class RoutePointReq implements Serializable {

    /**
     * 航点编号
     */
    private Integer routePointIndex;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 高度
     */
    private Double height;

    /**
     * 飞行速度
     */
    private Double speed;

    /**
     * 航点偏航角
     */
    private WaypointHeadingReq waypointHeadingReq;

    /**
     * 航点转弯模式
     */
    private WaypointTurnReq waypointTurnReq;

    /**
     * 航点云台俯仰角
     */
    private Double gimbalPitchAngle;

    /**
     * 航点动作列表
     */
    private List<ActionGroupReq> actionGroupList;

}

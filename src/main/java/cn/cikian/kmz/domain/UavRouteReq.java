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
public class UavRouteReq implements Serializable {

    /**
     * 航线类型
     */
    private String templateType;

    /**
     * 航线里程 m
     */
    private Double duration;

    /**
     * covre Img
     */
    private String coverImg;

    /**
     * 工作区ID
     */
    private String workspaceId;

    /**
     * 无人机类型
     */
    private Integer droneType;

    /**
     * 无人机子类型
     */
    private Integer subDroneType;

    /**
     * 负载类型
     */
    private Integer payloadType;

    /**
     * 负载子类型
     */
    private Integer subPayloadType;

    /**
     * 负载挂载位置
     */
    private Integer payloadPosition;

    /**
     * 负载图片存储类型
     */
    private String imageFormat;

    /**
     * 航线结束动作
     */
    private String finishAction;

    /**
     * 失控动作
     */
    private String exitOnRcLostAction;

    /**
     * 全局航线高度
     */
    private Double globalHeight;

    /**
     * 全局航线飞行速度
     */
    private Double autoFlightSpeed;

    /**
     * 全局偏航角模式
     */
    private WaypointHeadingReq waypointHeadingReq;

    /**
     * 全局航点转弯模式
     */
    private WaypointTurnReq waypointTurnReq;

    /**
     * 云台俯仰角控制模式
     */
    private String gimbalPitchMode;

    /**
     * 参考起飞点
     */
    private String takeOffRefPoint;

    /**
     * 航点列表
     */
    private List<RoutePointReq> routePointList;

    /**
     * 建图航拍、倾斜摄影、航带飞行模板参数
     */
    private MappingTypeReq mappingTypeReq;

    /**
     * 航线初始动作列表
     */
    private List<PointActionReq> startActionList;

}

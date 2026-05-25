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
public class WaypointHeadingReq implements Serializable {

    /**
     * 偏航角模式
     */
    private String waypointHeadingMode;

    /**
     * 偏航角度
     */
    private Double waypointHeadingAngle;

    /**
     * 兴趣点
     */
    private String waypointPoiPoint;
}

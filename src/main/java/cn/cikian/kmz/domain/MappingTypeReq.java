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
public class MappingTypeReq implements Serializable {

    /**
     * 采集方式
     */
    private String collectionMethod;

    /**
     * 镜头类型
     */
    private String lensType;

    /**
     * 航向重叠率
     */
    private Integer overlapH;

    /**
     * 旁向重叠率
     */
    private Integer overlapW;

    /**
     * 是否开启高程优化
     */
    private Integer elevationOptimizeEnable;

    /**
     * 拍照模式
     */
    private String shootType;

    /**
     * 航线方向
     */
    private String direction;

    /**
     * 测区外扩距离
     */
    private String margin;

    /**
     * 测区多边形坐标  经度,纬度,高度
     */
    private List<CoordinatePointReq> coordinates;


}

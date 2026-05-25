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
public class ActionGroupReq implements Serializable {

    /**
     * 动作组编号
     */
    private Integer actionGroupId;

    /**
     * 动作组开始生效的航点
     */
    private Integer actionGroupStartIndex;

    /**
     * 动作组结束生效的航点
     */
    private Integer actionGroupEndIndex;

    /**
     * 动作触发器类型
     */
    private String actionTriggerType;

    /**
     * 动作触发器参数
     */
    private Double actionTriggerParam;

    /**
     * 动作列表
     */
    private List<PointActionReq> actions;
}

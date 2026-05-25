package cn.cikian.kmz.domain;

import cn.cikian.kmz.domain.kml.KmlInfo;
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
public class KmzInfoVO implements Serializable {

    /**
     * 航线kml信息
     */
    private KmlInfo kmlInfo;

    /**
     * 航线wpml信息
     */
    private KmlInfo wpmlInfo;

}

package cn.cikian.kmz.util;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
@Data
@AllArgsConstructor
public class Gps {

    /**
     * 经度
     */
    private double wgLon;

    /**
     * 纬度
     */
    private double wgLat;
}

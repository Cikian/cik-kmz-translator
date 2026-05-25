package cn.cikian.kmz.service;

import cn.cikian.kmz.domain.KmzInfoVO;
import cn.cikian.kmz.domain.UavRouteReq;

import java.io.IOException;

/**
 *
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
public interface CikKmzService {

    /**
     * 编辑kmz文件
     */
    void updateKmz(UavRouteReq uavRouteReq);

    /**
     * 生成kmz文件(带航点)
     */
    String buildKmz(UavRouteReq uavRouteReq);

    /**
     * 解析kmz文件
     *
     * @param file
     */
    KmzInfoVO parseKmz(String file) throws IOException;
}

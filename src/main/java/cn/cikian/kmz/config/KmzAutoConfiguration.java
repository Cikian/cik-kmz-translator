package cn.cikian.kmz.config;


import cn.cikian.kmz.service.CikKmzService;
import cn.cikian.kmz.service.impl.CikKmzServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Cikian
 * @version 1.0
 * @implNote
 * @see <a href="https://www.cikian.cn">https://www.cikian.cn</a>
 * @since 2026-05-25 17:43
 */
@Configuration
public class KmzAutoConfiguration {
    private static final Logger log = LoggerFactory.getLogger(KmzAutoConfiguration.class);

    @Bean
    @ConditionalOnMissingBean
    public CikKmzService uavRouteService() {
        log.info("[Cik-KMZ]: 获取CikKmzServiceImpl Bean");
        return new CikKmzServiceImpl();
    }
}

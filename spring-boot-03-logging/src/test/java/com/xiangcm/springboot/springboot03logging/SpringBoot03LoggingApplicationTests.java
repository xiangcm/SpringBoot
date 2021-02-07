package com.xiangcm.springboot.springboot03logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot03LoggingApplicationTests {
    // 记录器
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
        // 日志级别，由低到高
        // 可以调整日志级别；日志只会在该级别及以后的高级别生效
        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");
        // SpringBoot默认给我们使用的是info级别的
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");
    }

}

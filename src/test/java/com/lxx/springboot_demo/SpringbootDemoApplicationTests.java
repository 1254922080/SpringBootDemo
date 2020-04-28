package com.lxx.springboot_demo;

import com.lxx.springboot_demo.bean.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDemoApplicationTests {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private Person person;

    @Test
    void contextLoads() {
        logger.trace("跟踪");
        logger.debug("调试");
        logger.info("信息");
        logger.error("错误");
    }

}

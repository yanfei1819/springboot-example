package com.yanfei1819.logotherdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogOtherDemoApplication {

    private static Logger logger = LogManager.getLogger(LogOtherDemoApplication.class);
    public static void main(String[] args) {
        logger.info("这里是整合其他日志框架");
        SpringApplication.run(LogOtherDemoApplication.class, args);
    }

}

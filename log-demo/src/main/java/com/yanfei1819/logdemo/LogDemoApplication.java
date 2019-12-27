package com.yanfei1819.logdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogDemoApplication {

    private static final Logger logger = LoggerFactory.getLogger(LogDemoApplication.class);

    public static void main(String[] args) {
        logger.info("hello,logback!");
        SpringApplication.run(LogDemoApplication.class, args);
    }

}

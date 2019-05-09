package com.yanfei1819.changeportdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class ChangePortDemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ChangePortDemoApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8088"));
        app.run(args);
    }

}

package com.yanfei1819.jspdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JspDemoApplication extends SpringBootServletInitializer {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        System.out.println("--------------项目启动-------------");
        return application.sources(JspDemoApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(JspDemoApplication.class, args);
    }
}

package com.yanfei1819.asynctaskdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@EnableAsync
@SpringBootApplication
public class AsyncTaskDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AsyncTaskDemoApplication.class, args);
    }
}

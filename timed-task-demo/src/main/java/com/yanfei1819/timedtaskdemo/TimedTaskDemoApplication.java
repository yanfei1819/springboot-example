package com.yanfei1819.timedtaskdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 定时任务
 */
@SpringBootApplication
@EnableScheduling
public class TimedTaskDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TimedTaskDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            int taskId = i;
            int finalI = i;
            service.execute(() -> {
                System.out.println("第" + taskId + "次任务的第" + finalI + "次执行");

            });
        }

    }
}

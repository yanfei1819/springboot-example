package com.yanfei1819.timedtaskdemo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by 追梦1819 on 2019-06-20.
 */
@Component
public class FirstTask {

    /**
     * cron 表达式
     */
//    @Scheduled(cron = "0/2 * * * * *")
//    @Scheduled(cron="${cron.schedule}")
    public void run(){
        System.out.println("这是创建的第一个定时任务");
    }
}

package com.yanfei1819.timedtaskdemo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by 追梦1819 on 2019-06-20.
 */
@Component
public class ThirdTask {

    /**
     * 与fixedDelay功能相同，上一次执行完毕时间点之后多长时间再执行(ms)，区别是：1、时间是字符串；2、支持占位符
     */
//    @Scheduled(fixedDelayString = "2000")
//    @Scheduled(fixedDelayString = "${time.fixedDelay}")
    public void run(){
        System.out.println("这是创建的第三个定时任务");
    }
}

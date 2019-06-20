package com.yanfei1819.timedtaskdemo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by 追梦1819 on 2019-06-20.
 */
@Component
public class SecondTask {

    /**
     * 上一次执行完毕时间点之后多长时间再执行(ms)
     */
//    @Scheduled(fixedDelay = 2000)
    public void run(){
        System.out.println("这是创建的第二个定时任务");
    }
}

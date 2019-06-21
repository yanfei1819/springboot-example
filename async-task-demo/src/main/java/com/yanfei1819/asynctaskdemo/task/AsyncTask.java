package com.yanfei1819.asynctaskdemo.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by 追梦1819 on 2019-06-21.
 */
@Component
public class AsyncTask {

    @Async
    public void task01() throws InterruptedException {
        Long start = System.currentTimeMillis();
        System.out.println("这是第一个异步任务！");
        Thread.sleep(2000);
        Long end = System.currentTimeMillis();
        System.out.println("第一个任务执行时间是："+(end-start));
    }

    @Async
    public void task02() throws InterruptedException {
        Long start = System.currentTimeMillis();
        System.out.println("这是第二个异步任务！");
        Thread.sleep(3000);
        Long end = System.currentTimeMillis();
        System.out.println("第二个任务执行时间是："+(end-start));
    }

    @Async
    public void task03() throws InterruptedException {
        Long start = System.currentTimeMillis();
        System.out.println("这是第三个异步任务！");
        Thread.sleep(4000);
        Long end = System.currentTimeMillis();
        System.out.println("第三个任务执行时间是："+(end-start));
    }
}

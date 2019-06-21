package com.yanfei1819.asynctaskdemo.web.controller;

import com.yanfei1819.asynctaskdemo.task.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 追梦1819 on 2019-06-21.
 */
@RestController
public class TaskController {


    @Autowired
    private AsyncTask asyncTask;

    @GetMapping("/testTask")
    public void testTask() throws InterruptedException {
        Long start = System.currentTimeMillis();
        asyncTask.task01();
        asyncTask.task02();
        asyncTask.task03();
        Long end = System.currentTimeMillis();
        System.out.println("三个任务执行总时间是："+(end-start));
    }
}

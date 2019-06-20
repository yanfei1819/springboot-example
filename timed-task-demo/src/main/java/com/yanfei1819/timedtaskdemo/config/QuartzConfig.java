package com.yanfei1819.timedtaskdemo.config;

import com.yanfei1819.timedtaskdemo.quartz.QuartzTask;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 追梦1819 on 2019-06-20.
 */
@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail testQuartz2() {
        return JobBuilder.newJob(QuartzTask.class).withIdentity("quartztask").storeDurably().build();
    }

    @Bean
    public Trigger testQuartzTrigger2() {
        //cron方式，每隔5秒执行一次
        return TriggerBuilder.newTrigger().forJob(testQuartz2())
                .withIdentity("quartztask")
                .withSchedule(CronScheduleBuilder.cronSchedule("*/5 * * * * ?"))
                .build();
    }
}

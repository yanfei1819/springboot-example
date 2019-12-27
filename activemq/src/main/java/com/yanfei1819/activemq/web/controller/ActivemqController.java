package com.yanfei1819.activemq.web.controller;

import com.yanfei1819.activemq.producer.Producer;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jms.Destination;

/**
 * Created by 追梦1819 on 2019-06-26.
 */
@Controller
public class ActivemqController {

    @Autowired
    private Producer producer;

    @ResponseBody
    @RequestMapping("/test")
    public void test(){
        Destination destination=new ActiveMQQueue("active.queue");
        for (int i = 0; i <50 ; i++) {
            producer.sendMessage(destination,"我是追梦1819，我的微信公众号是 technology-and-life ");
        }
    }
}

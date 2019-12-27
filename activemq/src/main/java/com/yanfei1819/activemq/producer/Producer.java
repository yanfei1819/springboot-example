package com.yanfei1819.activemq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

/**
 * Created by 追梦1819 on 2019-06-26.
 */
@Component
public class Producer {

    @Autowired
    private JmsMessagingTemplate template;

    public void sendMessage(Destination destination, String message){
        template.convertAndSend(destination,message);
    }

}

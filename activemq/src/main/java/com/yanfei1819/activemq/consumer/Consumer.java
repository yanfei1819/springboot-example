package com.yanfei1819.activemq.consumer;

        import org.springframework.jms.annotation.JmsListener;
        import org.springframework.stereotype.Service;

/**
 * Created by 追梦1819 on 2019-06-26.
 */
@Service
public class Consumer {

    @JmsListener(destination = "active.queue")
    public void receive(String text) {
        System.out.println("consumer接收到的报文为:" + text);
    }
}

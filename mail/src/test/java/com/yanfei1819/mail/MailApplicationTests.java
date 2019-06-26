package com.yanfei1819.mail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailApplicationTests {

    @Autowired
    private JavaMailSenderImpl sender;

    @Test
    public void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("开会");
        message.setText("今晚6点开会");
        message.setTo("yanfei1819@163.com");
        message.setFrom("shiyanfei@sz-sunwin.com");
        sender.send(message);
    }


    @Test
    public void test() throws MessagingException {
        MimeMessage message = sender.createMimeMessage();

        final MimeMessageHelper helper = new MimeMessageHelper(message,true);

        helper.setSubject("开会");

        helper.setText("<b>今晚6点开会</b>",true);
        helper.setTo("yanfei1819@163.com");
        helper.setFrom("shiyanfei@sz-sunwin.com");

        helper.addAttachment("mybatis源码",new File("C:\\Users\\Administrator\\Desktop\\MyBatis源码分析.md"));
        sender.send(message);

    }

}

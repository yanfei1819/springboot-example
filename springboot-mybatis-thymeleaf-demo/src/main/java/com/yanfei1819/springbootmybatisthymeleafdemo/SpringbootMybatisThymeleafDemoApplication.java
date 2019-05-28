package com.yanfei1819.springbootmybatisthymeleafdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yanfei1819.db.dao")
public class SpringbootMybatisThymeleafDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisThymeleafDemoApplication.class, args);
    }

}

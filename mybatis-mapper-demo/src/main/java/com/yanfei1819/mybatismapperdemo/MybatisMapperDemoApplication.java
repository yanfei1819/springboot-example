package com.yanfei1819.mybatismapperdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.yanfei1819.mybatismapperdemo.db")
public class MybatisMapperDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisMapperDemoApplication.class, args);
    }

}

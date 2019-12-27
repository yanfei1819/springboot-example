package com.yanfei1819.customizestartertest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomizeStarterTestApplication implements CommandLineRunner {

    @Value("${spring.person.name}")
    private String name;

    @Value("${spring.person.age}")
    private int age;

    public static void main(String[] args) {
        SpringApplication.run(CustomizeStarterTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("姓名是："+name+",年龄是："+age);
    }
}

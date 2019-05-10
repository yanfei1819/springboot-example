package com.yanfei1819.springbootstarter;

import com.yanfei1819.springbootstarter.entity.PersonProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(PersonProperties.class)
public class CustomizeSpringBootStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomizeSpringBootStarterApplication.class, args);
    }

}

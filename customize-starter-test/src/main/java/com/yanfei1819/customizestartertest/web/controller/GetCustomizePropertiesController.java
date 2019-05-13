package com.yanfei1819.customizestartertest.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 追梦1819 on 2019-05-13.
 */
@RestController
public class GetCustomizePropertiesController {

    @Value("${spring.person.name}")
    private String name;

    @Value("${spring.person.age}")
    private int age;

    @GetMapping("/getProperties")
    public String getProperties(){
        return "我叫"+name+",年龄是"+age;
    }
}

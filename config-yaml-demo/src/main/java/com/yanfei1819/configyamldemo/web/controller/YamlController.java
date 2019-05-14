package com.yanfei1819.configyamldemo.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 追梦1819 on 2019-05-13.
 */
@RestController
public class YamlController {

    @Value("${person.name}")
    private String name;

    @GetMapping("/getProperties")
    public String getProperties(){
        return name;
    }
}

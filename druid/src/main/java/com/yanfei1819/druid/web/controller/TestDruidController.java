package com.yanfei1819.druid.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 追梦1819 on 2019-07-01.
 */
@RestController
public class TestDruidController {

    @GetMapping("/testdruid")
    public void druid(){
        System.out.println("druid");
    }
}

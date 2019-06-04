package com.yanfei1819.logdemo.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 追梦1819 on 2019-06-04.
 */
@Controller
public class LoggerController {

    private static final Logger logger = LoggerFactory.getLogger(LoggerController.class);

    @ResponseBody
    @GetMapping("/getLogger")
    public void getLogger(){
        logger.info("hello,logger");
    }
}

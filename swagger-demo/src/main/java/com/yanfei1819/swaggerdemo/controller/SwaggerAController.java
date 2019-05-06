package com.yanfei1819.swaggerdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by 追梦1819 on 2019-05-06.
 */
@Controller
@RequestMapping("/swagger-a")
@Api(value = "测试第一个controller")
public class SwaggerAController {

    @ApiOperation(value = "controllerA的测试方法一",notes = "controllerA的测试方法一")
    @GetMapping("/test1")
    public void test1(){

    }

    @ApiOperation(value = "controllerA的测试方法二",notes = "controllerA的测试方法二")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户姓名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "用户密码", required = true, dataType = "String")
    })
    @PostMapping("/test2")
    public void test2(String name,String password){

    }

    @ApiOperation(value = "controllerA的测试方法三",notes = "controllerA的测试方法三")
    @ApiImplicitParam(name = "name", value = "用户姓名", required = true, dataType = "String")
    @GetMapping("/test3")
    public void test3(String name){

    }

    // 该接口忽略
    @ApiIgnore
    @GetMapping("/test4")
    public void test4(String name){

    }

}

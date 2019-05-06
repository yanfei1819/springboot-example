package com.yanfei1819.configdemo.config;

import com.yanfei1819.configdemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 追梦1819 on 2019-05-06.
 */
@Controller
public class ReadApplicationConfigController {

    @Value("${yanfei1819.name}")
    private String name;

    @Value("${yanfei1819.age}")
    private int age;

    @ResponseBody
    @RequestMapping("/getProperties")
    public String getProperties(){
        return "我的姓名是："+name+",我的年龄是："+age;
    }


    @Autowired
    private Student student;

    @ResponseBody
    @RequestMapping("/getBeanProperties")
    public String getBeanProperties(){
        return "学生姓名是："+student.getName()+",学生年龄是："+student.getAge()+",学生分数是："+student.getGrade()+student.getDescription();
    }



}

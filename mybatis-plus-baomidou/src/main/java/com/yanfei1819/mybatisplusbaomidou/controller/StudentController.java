package com.yanfei1819.mybatisplusbaomidou.controller;import com.yanfei1819.mybatisplusbaomidou.service.StudentService;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Controller;import org.springframework.web.bind.annotation.RequestMapping;/** * Created by shiyanfei on 2021-04-08. */@Controller@RequestMapping("/user")public class StudentController {    @Autowired    private StudentService studentService;    @RequestMapping("/insertStudent")    public void insertStudent(){        studentService.insertStudent(null);    }}
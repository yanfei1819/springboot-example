package com.yanfei1819.configymlread.config;import org.junit.jupiter.api.Test;import org.springframework.beans.factory.annotation.Value;/** * Created by shiyanfei on 2021-04-09. */public class YmlReadTest {    @Value("${student.name}")    private String name;    @Test    private void readString(){        System.out.println("读取的名称是："+name);    }}
package com.yanfei1819.configdemo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by 追梦1819 on 2019-05-06.
 */
@ConfigurationProperties(prefix = "class.student")
public class Student {
    private String name;
    private int age;
    private Double grade;

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}

package com.yanfei1819.springbootstarter.entity;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by 追梦1819 on 2019-05-10.
 */
@ConfigurationProperties(prefix = "spring.person")
public class PersonProperties {
    private String name;
    private int age;
    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

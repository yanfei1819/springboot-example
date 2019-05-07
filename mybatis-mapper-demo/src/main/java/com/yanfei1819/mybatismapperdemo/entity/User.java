package com.yanfei1819.mybatismapperdemo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 追梦1819 on 2019-05-07.
 */
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(generator = "JDBC") // 自增字段
    private Long id;
    private String name;
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}

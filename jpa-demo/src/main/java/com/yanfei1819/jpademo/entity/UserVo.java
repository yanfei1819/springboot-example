package com.yanfei1819.jpademo.entity;

import javax.persistence.*;

/**
 * Created by 追梦1819 on 2019-05-23.
 */
@Entity
@Table(name = "user")
@NamedQuery(name = "findAll",query = "select u from User u")
public class UserVo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "age")
    private int age;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

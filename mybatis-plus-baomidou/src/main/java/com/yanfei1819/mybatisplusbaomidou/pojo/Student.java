package com.yanfei1819.mybatisplusbaomidou.pojo;import com.baomidou.mybatisplus.annotation.TableName;/** * Created by shiyanfei on 2021-04-08. */@TableName(value = "student")public class Student {    private Long id;    private String sex;    private String name;    private String address;    private String callNo;    private Integer age;    public Long getId() {        return id;    }    public void setId(Long id) {        this.id = id;    }    public String getSex() {        return sex;    }    public void setSex(String sex) {        this.sex = sex;    }    public String getName() {        return name;    }    public void setName(String name) {        this.name = name;    }    public String getAddress() {        return address;    }    public void setAddress(String address) {        this.address = address;    }    public String getCallNo() {        return callNo;    }    public void setCallNo(String callNo) {        this.callNo = callNo;    }    public Integer getAge() {        return age;    }    public void setAge(Integer age) {        this.age = age;    }}
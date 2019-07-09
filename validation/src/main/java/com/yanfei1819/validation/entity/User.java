package com.yanfei1819.validation.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by 追梦1819 on 2019-07-01.
 */
public class User {

    @NotNull(message = "姓名不能为空")
    private String name;

    @Max(value = 30)
    @Min(value = 20)
    private int age;

    @Email(message = "请输入正确的邮箱")
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

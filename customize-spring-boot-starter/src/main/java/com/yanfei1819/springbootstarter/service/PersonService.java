package com.yanfei1819.springbootstarter.service;

import com.yanfei1819.springbootstarter.entity.PersonProperties;

/**
 * Created by 追梦1819 on 2019-05-10.
 */
public class PersonService {

    private PersonProperties properties;

    public PersonService(PersonProperties properties) {
        this.properties = properties;
    }

    public PersonService() {
    }

    public void say(){
        System.out.println("hello,I am "+properties.getName()+",and I am "+properties.getAge()+
                ",and My salary "+properties.getSalary());
    }
}

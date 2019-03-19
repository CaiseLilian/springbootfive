package com.hr.springbootfive.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Person {
    private Integer id;

    private Integer age;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private String name;

    private String sex;

    public Person() {
    }

    public Person(Integer id, Integer age, Date birthday, String name, String sex) {
        this.id = id;
        this.age = age;
        this.birthday = birthday;
        this.name = name;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
}
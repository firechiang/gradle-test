package com.firechiang.model;

/**
 * 用户
 * @author JIANG
 * @version 1.0
 * @date 2020/4/17
 * @deprecated com.firechiang.model
 */
public class User {

    String name;

    Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

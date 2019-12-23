package com.xiangmin.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/7/27
 */
public class Person {
    @Value("${person.age}")
    private int age;
    @Value("${person.name}")
    private String name;

    public Person(){

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
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

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

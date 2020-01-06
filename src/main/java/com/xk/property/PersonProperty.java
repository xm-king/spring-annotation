package com.xk.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author pingchun@gegejia.com
 * @since 2020/1/6
 */
@ConfigurationProperties(prefix = "person")
public class PersonProperty {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonProperty{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

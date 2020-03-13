package com.alibaba.config;

import com.alibaba.bean.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author pingchun@gegejia.com
 * @since 2020/1/6
 */
@Configuration
@PropertySource("classpath:/person.properties")
@ComponentScan("com.alibaba.bean")
public class PropertyConfig {

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private int age;

    @Bean
    public Person person(){
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return person;
    }
}

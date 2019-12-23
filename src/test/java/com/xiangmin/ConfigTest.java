package com.xiangmin;

import com.xiangmin.bean.Person;
import com.xiangmin.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/8/24
 */
public class ConfigTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = applicationContext.getBean("personDefault",Person.class);
        System.out.println(person);
    }
}

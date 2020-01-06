package com.xk;

import com.xk.bean.Person;
import com.xk.config.PropertyConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pingchun@meili-inc.com
 * @since 2020/1/6
 */
public class PropertyConfigTest {

    @Test
    public void propertyConfigTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertyConfig.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
    }
}

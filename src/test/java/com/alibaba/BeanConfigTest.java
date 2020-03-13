package com.alibaba;

import com.alibaba.bean.Person;
import com.alibaba.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/8/24
 */
public class BeanConfigTest {
    @Test
    public void beanTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = applicationContext.getBean("personDefault",Person.class);
        System.out.println(person);
    }
}

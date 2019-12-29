package com.xk;

import com.xk.bean.Person;
import com.xk.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/7/27
 */
public class ApplicationLaucher {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = applicationContext.getBean("personDefault",Person.class);
        System.out.println(person);
//        HelloService helloService = applicationContext.getBean(HelloService.class);
//        System.out.println(helloService);

        String[] beanNames = applicationContext.getBeanDefinitionNames();
        Arrays.asList(beanNames).forEach(beanName -> System.out.println(applicationContext.getBean(beanName).getClass()));
    }
}

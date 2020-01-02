package com.xk;


import com.xk.bean.Person;
import com.xk.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

/**
 * @author pingchun@gegejia.com
 * @since 2020/1/2
 */
@SpringBootApplication(scanBasePackages = "com.xk")
public class BootApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(BootApplication.class,args);
        Person person = applicationContext.getBean("personDefault",Person.class);
        System.out.println(person);
        HelloService helloService = applicationContext.getBean(HelloService.class);
        System.out.println(helloService);

        String[] beanNames = applicationContext.getBeanDefinitionNames();
        Arrays.asList(beanNames).forEach(beanName -> System.out.println(applicationContext.getBean(beanName).getClass()));
    }
}

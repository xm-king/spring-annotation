package com.xk.config;

import com.xk.bean.Person;
import org.springframework.context.annotation.*;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/7/27
 */
//配置类相当于xml文件，Configuration告诉Spring这是一个配置类
@Configuration
//ComponentScan 指定要扫描的包
@ComponentScan("com.xk")
@PropertySource("classpath:/person.properties")
//@Import(Color.class)
//@Import({MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class MainConfig {

    @Bean("personDefault")
    public Person personDefault(){
        return new Person();
    }

//    @Scope
//    @Lazy
//    @Bean("person")
//    public Person createPerson(){
//        return new Person(35,"相民");
//    }

//    @Bean("personConditional")
//    @Conditional(PersonConditional.class)
//    public Person createPersonConditional(){
//        return new Person(30,"相民");
//    }
}

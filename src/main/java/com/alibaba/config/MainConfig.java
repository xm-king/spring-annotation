package com.alibaba.config;

import com.alibaba.bean.Person;
import org.springframework.context.annotation.*;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/7/27
 */
//配置类相当于xml文件，Configuration告诉Spring这是一个配置类
@Configuration
public class MainConfig {

    @Bean("personDefault")
    public Person personDefault(){
        return new Person();
    }

}

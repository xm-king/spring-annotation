package com.xk.config;

import com.xk.bean.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author pingchun@gegejia.com
 * @since 2020/1/6
 */
@Configuration
@PropertySource("classpath:/person.properties")
@ComponentScan("com.xk.bean")
public class PropertyConfig {
}

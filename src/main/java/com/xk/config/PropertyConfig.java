package com.xk.config;

import com.xk.property.PersonProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author pingchun@gegejia.com
 * @since 2020/1/6
 */
@Configuration
@EnableConfigurationProperties(PersonProperty.class)
@ComponentScan("com.xk")
public class PropertyConfig {

    @Bean
    public PersonProperty personProperty(){
        return new PersonProperty();
    }
}

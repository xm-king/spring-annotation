package com.xk.config;

import com.xk.property.PersonProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author pingchun@gegejia.com
 * @since 2020/1/6
 */
@Configuration
@EnableConfigurationProperties(PersonProperty.class)
public class PropertyConfig {
}

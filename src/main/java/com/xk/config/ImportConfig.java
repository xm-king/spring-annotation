package com.xk.config;

import com.xk.custom.MyImportBeanDefinitionRegistrar;
import com.xk.custom.MyImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author pingchun@gegejia.com
 * @since 2020/1/6
 */
@Configuration
@ComponentScan("com.xk")
@Import({MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class ImportConfig {
}

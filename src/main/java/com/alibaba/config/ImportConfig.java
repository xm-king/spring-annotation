package com.alibaba.config;

import com.alibaba.custom.MyImportBeanDefinitionRegistrar;
import com.alibaba.custom.MyImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author pingchun@gegejia.com
 * @since 2020/1/6
 */
@Configuration
@ComponentScan("com.alibaba")
@Import({MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class ImportConfig {
}

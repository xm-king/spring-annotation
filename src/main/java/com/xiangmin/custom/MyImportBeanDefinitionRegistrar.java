package com.xiangmin.custom;

import com.xiangmin.bean.Red;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/8/22
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     *
     * @param importingClassMetadata 当前类的注解信息
     * @param registry BeanDefinetion的注册类
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
       boolean definition = registry.containsBeanDefinition("red");
        BeanDefinition beanDefinition = new RootBeanDefinition(Red.class);
       registry.registerBeanDefinition("red",beanDefinition);
    }
}

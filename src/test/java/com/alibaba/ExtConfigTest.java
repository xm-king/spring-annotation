package com.alibaba;

import com.alibaba.bean.Color;
import com.alibaba.config.ExtConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author tianming@alibaba-inc.com
 * @since 2020/3/12
 */
public class ExtConfigTest {

    @Test
    public void beanFactoryPostProcessorTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);
        Color color = applicationContext.getBean(Color.class);
        System.out.println(color);
    }
}

package com.xk;

import com.xk.config.PropertyConfig;
import com.xk.property.PersonProperty;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pingchun@gegejia.com
 * @since 2020/1/6
 */
public class PropertyConfigTest {


    @Test
    public void propertyConfigTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertyConfig.class);
        PersonProperty personProperty = applicationContext.getBean(PersonProperty.class);
        Assert.assertNotNull(personProperty);
        Assert.assertNotNull(personProperty.getName());
        Assert.assertNotNull(personProperty.getAge());
    }
}

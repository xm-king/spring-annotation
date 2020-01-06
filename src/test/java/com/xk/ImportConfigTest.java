package com.xk;

import com.xk.bean.Blue;
import com.xk.bean.Color;
import com.xk.bean.Green;
import com.xk.bean.Red;
import com.xk.config.MainConfig;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pingchun@gegejia.com
 * @since 2020/1/6
 */
public class ImportConfigTest {

    @Test
    public void importTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Assert.assertNotNull(applicationContext.getBean(Color.class));
        Assert.assertNotNull(applicationContext.getBean(Red.class));
        Assert.assertNotNull(applicationContext.getBean(Blue.class));
        Assert.assertNotNull(applicationContext.getBean(Green.class));
    }
}

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
 * @author pingchun@meili-inc.com
 * @since 2019/8/22
 */
public class ImportTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Color color = applicationContext.getBean(Color.class);
        Blue blue = applicationContext.getBean(Blue.class);
        Green green = applicationContext.getBean(Green.class);
        Red red = applicationContext.getBean(Red.class);
        Assert.assertNotNull(color);
        Assert.assertNotNull(blue);
        Assert.assertNotNull(green);
        Assert.assertNotNull(red);

    }
}

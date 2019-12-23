package com.xiangmin;

import com.xiangmin.bean.Blue;
import com.xiangmin.bean.Color;
import com.xiangmin.bean.Green;
import com.xiangmin.bean.Red;
import com.xiangmin.config.MainConfig;
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

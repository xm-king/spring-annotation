package com.xiangmin;

import com.xiangmin.config.AopConfiguration;
import com.xiangmin.service.MathCalculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/8/25
 */
public class AopTest {

    @Test
    public void aopTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfiguration.class);
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
        mathCalculator.div(5,2);
    }
}

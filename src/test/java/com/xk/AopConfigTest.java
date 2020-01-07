package com.xk;

import com.xk.config.AopConfiguration;
import com.xk.service.CalculatorService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/8/25
 */
public class AopConfigTest {

    @Test
    public void aopTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfiguration.class);
        CalculatorService calculatorService = applicationContext.getBean(CalculatorService.class);
        calculatorService.div(5,2);
    }
}

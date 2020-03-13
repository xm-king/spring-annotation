package com.alibaba.config;

import com.alibaba.aspect.LogAspect;
import com.alibaba.service.CalculatorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/8/25
 */
@Configuration
@EnableAspectJAutoProxy
public class AopConfiguration {

    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }

    @Bean
    public CalculatorService mathCalculator(){
       return new CalculatorService();
    }
}

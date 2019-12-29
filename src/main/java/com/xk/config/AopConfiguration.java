package com.xk.config;

import com.xk.aspect.LogAspect;
import com.xk.service.MathCalculator;
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
    public MathCalculator mathCalculator(){
       return new MathCalculator();
    }
}
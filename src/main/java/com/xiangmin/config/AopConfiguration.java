package com.xiangmin.config;

import com.xiangmin.aspect.LogAspect;
import com.xiangmin.service.MathCalculator;
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

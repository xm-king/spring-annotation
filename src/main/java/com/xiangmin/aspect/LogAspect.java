package com.xiangmin.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/8/25
 */
@Aspect
public class LogAspect {

    @Pointcut("execution(public int com.xiangmin.service.MathCalculator.*(..))")
    public void logPointcut(){};

    @Before("logPointcut()")
    public void beforLog(JoinPoint joinPoint){
        System.out.println("运行参数:"+joinPoint.getSignature());
    }

    @After("logPointcut()")
    public void afterLog(){
        System.out.println("结束参数:");
    }

    @AfterReturning("logPointcut()")
    public void returnLog(){
        System.out.println("运行结束:");
    }

    @AfterThrowing("logPointcut()")
    public void exceptionLog(){
        System.out.println("异常:");
    }
}

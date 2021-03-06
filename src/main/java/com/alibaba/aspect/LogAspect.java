package com.alibaba.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/8/25
 */
@Aspect
public class LogAspect {

    @Pointcut("execution(public int com.alibaba.service.CalculatorService.*(..))")
    public void logPointcut(){};

    @Before("logPointcut()")
    public void beforLog(JoinPoint joinPoint){
        System.out.println("运行方法:"+joinPoint.getSignature()+",运行参数:"+joinPoint.getArgs());
    }

    @After("logPointcut()")
    public void afterLog(){
        System.out.println("结束参数:");
    }

    @AfterReturning(value = "logPointcut()",returning = "result")
    public void returnLog(JoinPoint joinPoint,Object result){
        System.out.println("运行结束:"+result);
    }

    @AfterThrowing("logPointcut()")
    public void exceptionLog(){
        System.out.println("异常:");
    }
}

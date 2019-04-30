package com.vadik.basespring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class TestAspect {
    @Before("execution(* com.vadik.basespring.aop.*.*(..))")
    public void before(JoinPoint joinPoint){
        //Advice
        System.out.println("-> Advice @Before (\"execution(* com.vadik.basespring.aop.*.*(..))\")");
    }
}

package com.pengfei.spring.aop;

import org.aspectj.lang.annotation.*;

/**
 * Created by zhaopen on 2/7/2017.
 */
@Aspect
public class AspectAdvice {

    @After("execution(* com.pengfei.spring.aop.*.*.*(..))")
    void log(){
        System.out.println("log...");
    }

    @AfterReturning(returning = "rvt", pointcut = "execution(* com.pengfei.spring.aop.*.*.*(..))")
    void report(String rvt){
        System.out.println("return value： " + rvt);
    }

    @AfterThrowing(throwing = "ex", pointcut = "execution(* com.pengfei.spring.aop.*.*.*(..))")
    void catchEx(Exception ex){
        ex.printStackTrace();
    }
}

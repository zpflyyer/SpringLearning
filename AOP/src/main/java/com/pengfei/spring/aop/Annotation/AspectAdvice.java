package com.pengfei.spring.aop.Annotation;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by zhaopen on 2/7/2017.
 */
@Aspect
public class AspectAdvice {

    @Pointcut("execution(* com.pengfei.spring.aop.Annotation.*.*.*(..))")
    private void methExecute(){}

    @SneakyThrows
    @Around(value = "methExecute()")
    Object aroundHandle(ProceedingJoinPoint pj){
        System.out.println("before execution");
        Object rvt = pj.proceed();
        System.out.println("after execution");
        if (rvt !=null && rvt instanceof String){
            rvt += "[changed returning]";
        }
        return rvt;
    }

    @Before(value = "methExecute()")
    void checkAuth(){
        System.out.println("checking authority before execution...");
    }

    @After(value = "methExecute()")
    void release(){
        System.out.println("releasing resource, just like a finally block");
    }

    @AfterReturning(returning = "rvt", pointcut = "methExecute()")
    void report(String rvt){
        System.out.println("no exception and return value： " + rvt + ", return value type: " + rvt.getClass());
    }

    @AfterThrowing(throwing = "ex", pointcut = "methExecute()")
    void catchEx(Exception ex){
        ex.printStackTrace();
    }

}

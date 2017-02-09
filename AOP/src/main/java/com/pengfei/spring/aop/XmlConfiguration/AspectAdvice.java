package com.pengfei.spring.aop.XmlConfiguration;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by zhaopen on 2/7/2017.
 */
public class AspectAdvice {

    private void methExecute(){}

    void checkAuth(){
        System.out.println("checking authority before execution...");
    }

    void release(){
        System.out.println("releasing resource, just like a finally block");
    }

    void report(String rvt){
        System.out.println("no exception and return value： " + rvt + ", return value type: " + rvt.getClass());
    }

    void catchEx(Exception ex){
        ex.printStackTrace();
    }

    @SneakyThrows
    Object aroundHandle(ProceedingJoinPoint pj){
        System.out.println("before execution");
        Object rvt = pj.proceed();
        System.out.println("after execution");
        if (rvt !=null && rvt instanceof String){
            rvt += "[changed returning]";
        }
        return rvt;
    }
}

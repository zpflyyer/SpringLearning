package com.pengfei.spring.factorymethod.DependsOn;

import lombok.ToString;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by zhaopen on 1/10/2017.
 */
class ClassB implements BeanNameAware,InitializingBean{
    private ClassA classA;
    private int b;
    private String beanName;
    public void setBeanName(String s) {
        this.beanName = beanName;
        System.out.println("classB beanname set!");
    }

    public void setClassA(ClassA classA) {
        this.classA = classA;
        System.out.println("classA injected!");
    }

    public void setB(int b) {
        this.b = b;
        System.out.println("b set");
    }

    ClassB(){
        System.out.println("classB created!");
    }

    void initMethod(){
        System.out.println("initMethod excuted!");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet excuted!");
    }
}

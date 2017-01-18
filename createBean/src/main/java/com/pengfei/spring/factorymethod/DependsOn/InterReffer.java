package com.pengfei.spring.factorymethod.DependsOn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaopen on 1/10/2017.
 */
class InterReffer {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("dp_bn_init.xml");
        ctx.getBean(ClassB.class);
    }
}

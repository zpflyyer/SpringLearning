package com.pengfei.spring.factorymethod.AbstractBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaopen on 1/3/2017.
 */
class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("abs_beans.xml");
        Dog whiteDog = ctx.getBean("whiteDog",Dog.class);
        Dog blackDog = ctx.getBean("blackDog",Dog.class);
        System.out.println(whiteDog);
        System.out.println(blackDog);
    }
}

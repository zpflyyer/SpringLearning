package com.pengfei.spring.ceateBean.MethodInvokingFactoryBean;

import lombok.Setter;
import lombok.ToString;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaopengfei on 2017/1/15.
 */
@Setter
@ToString
class Cat {
    private int age;
    private String name;

    public int grow(int age){
        return ++age;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("mifb_beans.xml");
        System.out.println(ctx.getBean("tom2"));
    }
}

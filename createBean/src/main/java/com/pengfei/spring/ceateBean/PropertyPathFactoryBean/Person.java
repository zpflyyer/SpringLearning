package com.pengfei.spring.ceateBean.PropertyPathFactoryBean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaopengfei on 2017/1/11.
 */
@Setter
@Getter
class Person {
    private  String name;
    private  int age;
    private Son son;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ppfb_beans.xml");
        System.out.println(ctx.getBean("person.son"));
    }
}

package com.pengfei.spring.ceateBean.FieldRetrivingFactoryBean;

import lombok.Setter;
import lombok.ToString;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaopengfei on 2017/1/15.
 */
@Setter
@ToString
class Son {
    private  int age;
    private String name;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("frfb_beans.xml");
        System.out.println(ctx.getBean("son"));
    }
}

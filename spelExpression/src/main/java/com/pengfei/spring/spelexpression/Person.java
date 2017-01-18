package com.pengfei.spring.spelexpression;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaopengfei on 2017/1/15.
 */
@AllArgsConstructor
@ToString
@Getter
@Setter
class Person {
    public Integer age;
    private String name;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spel_beans.xml");
        System.out.println(ctx.getBean("person"));
    }
}

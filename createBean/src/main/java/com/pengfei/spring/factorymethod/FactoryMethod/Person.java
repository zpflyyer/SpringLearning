package com.pengfei.spring.factorymethod.FactoryMethod;

import lombok.Setter;
import lombok.ToString;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaopen on 1/2/2017.
 */
@Setter
@ToString
//此处如果提供有参构造器，那么在不提供无参构造器时完全采取设值注入方式将导致错误（因为找不到无参数构造器）。
//@AllArgsConstructor
public class Person {
    private Gun gun;
    private Dog dog;
    private KindEnum kind;

    private void initMethod(){
        System.out.println();
    }
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Person p = ctx.getBean("person",Person.class);
        System.out.println(p);
    }
}

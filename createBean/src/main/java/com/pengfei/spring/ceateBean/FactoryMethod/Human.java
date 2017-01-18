package com.pengfei.spring.ceateBean.FactoryMethod;

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
public class Human {
    private Gun gun;
    private Dog dog;
    private HumanKind kind;

    private void initMethod(){
        System.out.println();
    }
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("fm_beans.xml");
        Human p = ctx.getBean("person",Human.class);
        System.out.println(p);
    }
}

package com.pengfei.spring.aop.XmlConfiguration;

import com.pengfei.spring.aop.XmlConfiguration.Service.Dog;
import com.pengfei.spring.aop.XmlConfiguration.Service.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaopen on 2/7/2017.
 */
public class AOPTestXml {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop_xmlconfig.xml");
        System.out.println(java.util.Arrays.toString(ctx.getBeanDefinitionNames()));
        Person p = (Person) ctx.getBean("person");
        p.eat("hotdog");
        p.drink("water");
        p.isHungry();
        System.out.println(ctx.getBean("dog").getClass());
        Dog dog = (Dog)ctx.getBean("dog");
        dog.eat();
    }
}

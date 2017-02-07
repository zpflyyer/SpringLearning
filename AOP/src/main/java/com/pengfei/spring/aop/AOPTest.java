package com.pengfei.spring.aop;

import com.pengfei.spring.aop.Service.Dog;
import com.pengfei.spring.aop.Service.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaopen on 2/7/2017.
 */
public class AOPTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop_beans.xml");
        /*
        1.IOC容器内的bean如果实现了接口，那么Spring为其创建的Instance其实是dynamic proxy（com.sun.proxy.$proxy）,此时其实找不到一个类型为interface
        实现类的bean的即，ctx.getBean（xxx.class）会找不到bean，解决办法：通过名称去获取bean，并且以接口类型去声明获得的bean的类型；
        2. 关于报访问权限：所以bean其实都在IOC里，不论它们（的类型）定义在在哪些不同的包里，只不过在没有对某个类的访问权限时，依然可以使用其实现的接口的类
        型去使用，即，所谓的包访问权限其实限制的是以什么样的类型来对待对象（接口是非包私有的，所以可以以接口类型使用，接口的实现类私有，则不能以实现类的类型
        去使用），至于对象本身则是可以到处传播的。
         */
        System.out.println(java.util.Arrays.toString(ctx.getBeanDefinitionNames()));
        System.out.println(ctx.getBean("person").getClass());
        Person p = (Person) ctx.getBean("person");
        p.eat("hotdog");
        p.drink("water");
        p.isHungry();
        System.out.println(ctx.getBean("dog").getClass());
        Dog dog = (Dog)ctx.getBean("dog");
        dog.eat();
    }
}

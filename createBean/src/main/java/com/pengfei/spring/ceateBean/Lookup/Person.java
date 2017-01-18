package com.pengfei.spring.ceateBean.Lookup;

import lombok.Getter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaopengfei on 2017/1/10.
 */
@Getter
abstract class Person {

    private Dog dog;
    abstract public  Dog getDogMethod();

    void hunt() {
        System.out.println("l take " + getDogMethod() + " to hunt!");
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("lu_beans.xml");
        Person person = ctx.getBean(Person.class);
        Person person1 = ctx.getBean(Person.class);
        System.out.println("person == person1 ? " + (person==person1));
        System.out.println("person.dog == null ? " + (person.getDog() == null ));
        System.out.println("person.getDog() == person1.getDog() ? " + (person.getDog() == person1.getDog()));
        System.out.println("person.getDogMethod() == person1.getDogMethod() ? " + (person.getDogMethod() == person1.getDogMethod()));
        System.out.println("可见，这是一种运行时的动态延迟加载，只有调用该方法时才会获得prototype的bean，无需使用属性存储");
        person.hunt();
        person1.hunt();
    }
}

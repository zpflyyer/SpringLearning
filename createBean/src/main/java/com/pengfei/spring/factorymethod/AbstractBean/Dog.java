package com.pengfei.spring.factorymethod.AbstractBean;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.java.Log;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaopen on 1/3/2017.
 */
@ToString
@AllArgsConstructor
class Dog {
    int age;
    String color;
}

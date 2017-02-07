package com.pengfei.spring.aop.Impl;

import com.pengfei.spring.aop.Service.Person;
import org.springframework.stereotype.Component;

/**
 * Created by zhaopen on 2/7/2017.
 */
@Component("person")
class PersonImpl implements  Person{
    public String eat(String foodname){
        System.out.println("eating " + foodname);
        return "good";
    }

    public void drink(String drinkname){
        System.out.println("drinking " + drinkname);
    }

    public boolean isHungry(){
        System.out.println("is hungry ");
        return true;
    }
}

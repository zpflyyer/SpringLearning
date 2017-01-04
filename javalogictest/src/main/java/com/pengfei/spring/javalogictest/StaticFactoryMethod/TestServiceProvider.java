package com.pengfei.spring.javalogictest.StaticFactoryMethod;

import com.pengfei.spring.javalogictest.StaticFactoryMethod.API.Animal;
import com.pengfei.spring.javalogictest.StaticFactoryMethod.API.Animals;

/**
 * Created by zhaopen on 1/4/2017.
 */
class TestServiceProvider {

    public static void main(String[] args) {
        //虽然Dog是包私有的，但是Animal接口是public的。
        Animal dog = Animals.valueOf("dog");
        System.out.println(dog);
        dog.introSelf();
    }
}

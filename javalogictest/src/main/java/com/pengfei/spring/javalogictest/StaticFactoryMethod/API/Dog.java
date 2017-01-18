package com.pengfei.spring.javalogictest.StaticFactoryMethod.API;

import lombok.ToString;

/**
 * Created by zhaopen on 1/4/2017.
 */
@ToString
class Dog extends Animal {
    int name;
    @Override
    public void introSelf() {
        System.out.println( "小狗喜欢啃骨头");
    }
}


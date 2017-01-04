package com.pengfei.spring.javalogictest.StaticFactoryMethod.API;

/**
 * Created by zhaopen on 1/4/2017.
 */
 class Cat extends Animal {
     @Override
    public void introSelf() {
        System.out.println( "猫咪喜欢抓老鼠" );
    }
}

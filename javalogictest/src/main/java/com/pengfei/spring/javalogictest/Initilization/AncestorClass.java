package com.pengfei.spring.javalogictest.Initilization;

/**
 * Created by zhaopengfei on 2017/1/1.
 */
class AncestorClass {

    static {
        System.out.println("AncestorClass Static Initialization Block");
    }

    {
        System.out.println("AncestorClass  Initialization Block");
    }

    AncestorClass(){
        System.out.println("AncestorClass Constructor");
    }
}

package com.pengfei.spring.javalogictest.Initilization;

/**
 * Created by zhaopengfei on 2017/1/1.
 */
//1.继承树上的静态初始化块；
    //2.继承树上的普通初始化块和构造方法
public class SubClass extends SuperClass{

    static {
        System.out.println("SubClass Static Initialization Block");
    }

    {
        System.out.println("SubClass Initialization Block");
    }

    private SubClass(){
        System.out.println("SubClass Constructor");
    }

    public static void main(String[] args){
        new SubClass();
        System.out.println("");
        new SubClass();
    }
}

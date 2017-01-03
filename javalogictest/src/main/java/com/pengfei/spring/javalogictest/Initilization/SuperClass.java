package com.pengfei.spring.javalogictest.Initilization;

/**
 * Created by zhaopengfei on 2017/1/1.
 */
//a.默认构造器 即 1."编译器默认提供的parameterless构造器"；
//如果程序提供了另外的构造器（不论有无参数），则编译器就不再提供默认的无参构造器；
//subclass的任何构造器 b.默认 会调用superclass的  2."parameterless构造器"（ 不论是编译器默认提供的还是程序里实现的）；
//如果subclass只提供 3.有参数构造器，那么subclass必须显式调用superclass的有参数构造器.
//    All in all,java will always create an object with least spend!
public class SuperClass extends AncestorClass{

    static {
        System.out.println("SuperClass Static Initialization Block");
    }

    {
        System.out.println("SuperClass  Initialization Block");
    }

    SuperClass(){
        System.out.println("SuperClass Constructor");
    }

}

package com.pengfei.spring.javalogictest.Inheritance;

import lombok.extern.java.Log;

import java.util.logging.Level;

/**
 * Created by zhaopen on 12/30/2016.
 */
//总结：什么是可以继承的：基类中非私有的域和方法；
//     继承的特点：声明类型为基类的对象，即使编译时类型为导出类时，其非私有域依然是基类的值，只有非私有方法可能被导出类覆盖；从内存分配上来说就是如此
@Log
class ClassB extends ClassA {
    public int field2 = 4;

    public static void main(String[] args) {
        ClassB b = new ClassB();
        ClassA a = new ClassB();
        ClassA c = new ClassA();
        log.log(Level.INFO, String.valueOf(b.field2));
        log.log(Level.INFO, String.valueOf(a.field2));
    }
}

package com.pengfei.spring.factorymethod.DependsOn;

import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhaopen on 1/10/2017.
 */
class ClassA {
//    private ClassB classB;
    private int a;

//    public void setClassB(ClassB classB) {
//        this.classB = classB;
//    }

    public void setA(int a) {
        this.a = a;
    }
    ClassA(){
        System.out.println("classA created!");
    }
}

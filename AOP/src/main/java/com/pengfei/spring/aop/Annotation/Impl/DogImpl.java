package com.pengfei.spring.aop.Annotation.Impl;

import com.pengfei.spring.aop.Annotation.Service.Dog;
import org.springframework.stereotype.Component;

/**
 * Created by zhaopen on 2/7/2017.
 */
@Component("dog")
class DogImpl implements Dog {

    public String eat() {
        System.out.println("eating bone");
        return "delicious";
    }
}

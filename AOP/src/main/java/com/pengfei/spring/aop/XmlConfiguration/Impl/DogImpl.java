package com.pengfei.spring.aop.XmlConfiguration.Impl;

import com.pengfei.spring.aop.XmlConfiguration.Service.Dog;
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

package com.pengfei.spring.javalogictest.StaticFactoryMethod.API;

import lombok.SneakyThrows;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zhaopen on 1/4/2017.
 */
public class Animals {

    //prevent instantiation
    private  Animals(){}

    private static  String classpath = "com.pengfei.spring.javalogictest.StaticFactoryMethod.API.";

    private static final Map<String,Animal> animals =
            new ConcurrentHashMap<String, Animal>();

    //①返回接口而不是实现类，可以避免暴露实现类；方法是将接口和接口的服务全部设为public,外部执行接口服务将导致后期绑定调用。当然，通过继承也可以做到。
    //②静态工厂方法有能力对同一类型只返回一个不变的实例，从而使得 ‘==’ 可以替代equals()，提高了性能。
    @SneakyThrows
    public static Animal valueOf(String name){
        if (!animals.containsKey(name)){
            Class clazz = Class.forName(classpath
                    + name.substring(0,1).toUpperCase()
                    + name.substring(1));
            animals.put(name,(Animal) clazz.newInstance());
        }
        return animals.get(name);
    }

//    public static <K,V> HashMap<K,V> newHashMap(){
//        return new HashMap<K, V>();
//    }
}

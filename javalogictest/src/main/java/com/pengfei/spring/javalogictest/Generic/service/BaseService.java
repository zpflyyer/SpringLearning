package com.pengfei.spring.javalogictest.Generic.service;

/**
 * Created by zhaopengfei on 2017/1/17.
 */
public interface BaseService<T> {
    void save(T t);
}

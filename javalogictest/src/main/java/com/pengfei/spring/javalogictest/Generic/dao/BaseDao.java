package com.pengfei.spring.javalogictest.Generic.dao;

/**
 * Created by zhaopengfei on 2017/1/17.
 */
public interface BaseDao<T> {
    void add(T t);
}

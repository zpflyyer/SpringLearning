package com.pengfei.spring.javalogictest.Generic.dao.Impl;

import com.pengfei.spring.javalogictest.Generic.dao.BaseDao;

/**
 * Created by zhaopengfei on 2017/1/17.
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

    public void add(T t) {
        System.out.println("保存实体 " + t);
    }
}

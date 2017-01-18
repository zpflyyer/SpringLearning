package com.pengfei.spring.javalogictest.Generic.service.Impl;

import com.pengfei.spring.javalogictest.Generic.dao.BaseDao;
import com.pengfei.spring.javalogictest.Generic.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhaopengfei on 2017/1/17.
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private BaseDao<T> dao;

    public void save(T t) {
        System.out.println("调用" + dao + "保存实体 " + t);
        dao.add(t);
    }
}

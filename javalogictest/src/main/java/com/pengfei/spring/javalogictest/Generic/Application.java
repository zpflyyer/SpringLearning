package com.pengfei.spring.javalogictest.Generic;

import com.pengfei.spring.javalogictest.Generic.domain.Item;
import com.pengfei.spring.javalogictest.Generic.service.Impl.ItemServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhaopengfei on 2017/1/17.
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.pengfei.spring.javalogictest.Generic");
        ItemServiceImpl itemService = ctx.getBean("itemService", ItemServiceImpl.class);
        itemService.save(new Item());
    }
}

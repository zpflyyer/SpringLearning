package com.pengfei.spring.BeanPostProcessor;

import com.sun.org.apache.xpath.internal.SourceTree;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by zhaopen on 1/16/2017.
 */
@ToString
@Setter
@AllArgsConstructor
class Human implements InitializingBean, DisposableBean
{
    private int age;
    private String name;

    @PostConstruct
    void introSelf(){
        System.out.println("@PostConstruct invoking");
    }

    @PreDestroy
    void sayGoodbye(){
        System.out.println("@PreDestroy invoking");
    }

    public void destroy() throws Exception {
        System.out.println("DisposableBean.destroy() Method Invoking");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean.afterPropertiesSet() Method Invoking");
    }
}

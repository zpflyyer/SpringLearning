package com.pengfei.spring.factorymethod.Factory_Bean;

import lombok.Setter;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Field;

/**
 * Created by zhaopen on 1/3/2017.
 */
@Setter
public class GetFiledFactoryBean implements FactoryBean{

    private String targetClass;
    private String targetField;

    public Object getObject() throws Exception {
        Class clazz = Class.forName(targetClass);
        Field field = clazz.getField(targetField);
        return field.get(null);
    }

    public Class<? extends  Object> getObjectType() {
        return Object.class;
    }

    public boolean isSingleton() {
        return false;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("fb_beans.xml");
        System.out.println(ctx.getBean("north"));
        System.out.println(ctx.getBean("&north"));
    }
}

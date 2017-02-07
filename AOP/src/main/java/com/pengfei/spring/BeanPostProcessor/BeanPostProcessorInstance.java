package com.pengfei.spring.BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by zhaopen on 1/16/2017.
 */
@Component
public class BeanPostProcessorInstance implements BeanPostProcessor{
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization() invoking : " + o.toString());
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        if (o instanceof Human){
            ((Human) o).setName("Jackson");
        }
        System.out.println("postProcessAfterInitialization() invoking : " + o.toString());
        return o;
    }
}

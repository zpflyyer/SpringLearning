package com.pengfei.spring.aop.BeanPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhaopen on 1/16/2017.
 */
@ComponentScan
@Configuration
class BeanPostProcessorTest {

    @Bean
    Human confregHuman(){
        return new Human(19,"Lothar");
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanPostProcessorTest.class);
//        System.out.println(ctx.getBean(Human.class));
    }
}

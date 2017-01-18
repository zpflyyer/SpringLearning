package com.pengfei.spring.springevent;

import com.pengfei.spring.springevent.Event.EventEnum;
import com.pengfei.spring.springevent.Publisher.BasePublisherAutowired;
import com.pengfei.spring.springevent.Publisher.BroadcastPublisherAware;
import com.pengfei.spring.springevent.Publisher.EmailPublisherAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zhaopen on 12/28/2016.
 */
@ComponentScan
@ImportResource("classpath:/beans.xml")
@Import(EventConfig.class)
public class Application {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        context.getBean(BasePublisherAutowired.class).publishEvent();
        context.getBean(BroadcastPublisherAware.class).publishEvent();
        context.getBean(EmailPublisherAware.class).publishEvent();
//        System.out.println(context.getBean("notice"));

    }
}

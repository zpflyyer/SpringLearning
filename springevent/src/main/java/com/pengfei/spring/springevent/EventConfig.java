package com.pengfei.spring.springevent;

import com.pengfei.spring.springevent.Event.BroadcastEvent;
import com.pengfei.spring.springevent.Event.EmailEvent;
import com.pengfei.spring.springevent.Service.BaseEvent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by zhaopen on 12/30/2016.
 */
@Configuration
public class EventConfig {

    @Value("hello,this is a base event message") String message;
    @Bean
    @Primary
    BaseEvent genBaseEvent(){
        return  new BaseEvent("test",message);
    }

    @Value("jackson@crazy.com")String address;
    @Value("Jack")String name;
    @Value("Hi,this is an email messge")String email_message;
    @Bean
    EmailEvent genEmailEvent(){
        return new EmailEvent("test",email_message, address,name);
    }

    @Value("hey,this is a broadcast message") String broadcast_message;
    @Bean
    BroadcastEvent genBroadcastEvent(){
        return new BroadcastEvent("test",broadcast_message, BroadcastEvent.BroadcastType.Notice,new java.util.Date());
    }
}

package com.pengfei.spring.springevent.Publisher;

import com.pengfei.spring.springevent.Service.BaseEvent;
import com.pengfei.spring.springevent.Service.EventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by zhaopen on 12/29/2016.
 */
@Component
public class BasePublisherAutowired extends EventPublisher{

    @Autowired(required = true)
    private ApplicationContext ctx;

    @Autowired(required = true)
    private BaseEvent baseEvent;

    @Override
    public void publishEvent(){
         this.ctx.publishEvent(baseEvent);
    }
}

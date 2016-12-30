package com.pengfei.spring.springevent.Publisher;

import com.pengfei.spring.springevent.Event.BroadcastEvent;
import com.pengfei.spring.springevent.Service.EventPublisher;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by zhaopen on 12/30/2016.
 */
@Component
public class BroadcastPublisherAware extends EventPublisher implements ApplicationContextAware {

    @Autowired(required = true)
    private BroadcastEvent broadcastEvent;
    private ApplicationContext ctx;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }

    public void publishEvent() {
        this.ctx.publishEvent(broadcastEvent);
    }
}

package com.pengfei.spring.springevent.Publisher;

import com.pengfei.spring.springevent.Event.EmailEvent;
import com.pengfei.spring.springevent.Service.EventPublisher;
import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by zhaopen on 12/29/2016.
 */
@Component
public class EmailPublisherAware extends EventPublisher implements ApplicationContextAware{

    @Autowired(required = true)
    private EmailEvent emailEvent;

    private ApplicationContext ctx;

    @SneakyThrows
    public void setApplicationContext(ApplicationContext applicationContext)  {
        this.ctx = applicationContext;
    }

    @Override
    public void publishEvent(){
        this.ctx.publishEvent(emailEvent);
    }
}

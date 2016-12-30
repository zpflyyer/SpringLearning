package com.pengfei.spring.springevent;

import com.pengfei.spring.springevent.Event.BroadcastEvent;
import com.pengfei.spring.springevent.Event.EmailEvent;
import com.pengfei.spring.springevent.Service.BaseEvent;
import lombok.extern.java.Log;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.logging.Level;

/**
 * Created by zhaopen on 12/28/2016.
 */
@Component
@Log
public  class EventNotifer implements ApplicationListener {

    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if( applicationEvent instanceof BaseEvent ){
            BaseEvent event = (BaseEvent)applicationEvent;
            log.log(Level.INFO,event.getEvent_type() + "\t" + event.getMessage());

            if(event instanceof BroadcastEvent){
                BroadcastEvent broadcastEvent = (BroadcastEvent)event;
                log.log(Level.INFO,broadcastEvent.getBroadcastType() + "\t" + broadcastEvent.getTime());
            }
            else if(event instanceof EmailEvent){
                EmailEvent emailEvent = (EmailEvent)event;
                log.log(Level.INFO,emailEvent.getAddress()+"\t"+emailEvent.getName());
            }
        }
    }
}

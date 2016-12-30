package com.pengfei.spring.springevent.Service;

import lombok.Data;
import lombok.extern.java.Log;
import org.springframework.context.ApplicationEvent;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Level;

/**
 * Created by zhaopen on 12/28/2016.
 */

//Every subclass constructor calls the default constructor of the super class, if the subclass constructor
//does not explicitly call some other constructor of the super class. So, if your subclass constructor
//explicitly calls a super class constructor that you provided (with arguments), then there is no need
//of no arguments constructor in the super class. So, the following will compile；
@Data
@Log
public class BaseEvent extends ApplicationEvent {

    Event_Type event_type;
    private String message;

    public BaseEvent(Object source,String message){
        super(source);
        this.message = message;
        this.event_type = Event_Type.General_Type;
    }

    @PostConstruct
    public void initMethod(){
        log.log(Level.INFO,"初始化：" + this + "now has been initialized!");
    }

    @PreDestroy
    public void destroyMethod(){
        log.log(Level.INFO, "销毁：" + this + "is going to be destroyed!");
    }

    public enum Event_Type {
        General_Type, Email_Type, Broadcast_Type
    }
}

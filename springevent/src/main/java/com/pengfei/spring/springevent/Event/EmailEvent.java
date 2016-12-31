package com.pengfei.spring.springevent.Event;

import com.pengfei.spring.springevent.Service.BaseEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by zhaopen on 12/29/2016.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EmailEvent extends BaseEvent{

    Event_Type event_type;
    private String message;
    private String address;
    private String name;

    public EmailEvent(Object source,String message,String address,String name) {
        super(source, message);
        this.event_type = Event_Type.Email_Type;
        this.address = address;
        this.name = name;
        this.message = message;
    }
}

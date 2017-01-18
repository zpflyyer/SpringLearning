package com.pengfei.spring.springevent.Event;

import com.pengfei.spring.springevent.Service.BaseEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by zhaopen on 12/29/2016.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class EmailEvent extends BaseEvent{

    private String address;
    private String name;

    public EmailEvent(Object source,String message,String address,String name) {
        super(source, message);
        this.event_type = EventEnum.EMAIL_TYPE;
        this.address = address;
        this.name = name;
    }
}

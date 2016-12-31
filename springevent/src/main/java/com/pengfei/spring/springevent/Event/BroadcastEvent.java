package com.pengfei.spring.springevent.Event;

import com.pengfei.spring.springevent.Service.BaseEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * Created by zhaopen on 12/30/2016.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BroadcastEvent extends BaseEvent {

    BroadcastType broadcastType;
    private Date time;
    private String message;

    public BroadcastEvent(Object source,String message,BroadcastType broadcastType,Date time) {
        super(source,message);
        this.event_type = Event_Type.Broadcast_Type;
        this.message = message;
        this.broadcastType = broadcastType;
        this.time = time;
    }

    public enum BroadcastType{
        Warning,News,Notice,Fun,General
    }
}

package com.pengfei.spring.springevent.Event;

import com.pengfei.spring.springevent.Service.BaseEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * Created by zhaopen on 12/30/2016.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class BroadcastEvent extends BaseEvent {

    private BroadcastEnum broadcastType;
    private Date time;

    public BroadcastEvent(Object source, String message, Date time) {
        super(source,message);
        this.event_type = EventEnum.BROADCAST_TYPE;
        this.message = message;
//        this.broadcastType = broadcastType;
        this.time = time;
    }
}

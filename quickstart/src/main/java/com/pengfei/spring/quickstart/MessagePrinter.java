package com.pengfei.spring.quickstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * Created by zhaopen on 12/28/2016.
 */
@Component
@Lazy
public class MessagePrinter {


    private MessgeService service;
    @Autowired
//    @Qualifier("MesServ,@123")
//    or , replace @Autwired + @Qualifier("MesServ,@123") with @Resource(name = "MesServ,@123")
    public  void setMesageService(MessgeService service) {
        System.out.println("MessageService Injected!");
        this.service = service;
    }

    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}

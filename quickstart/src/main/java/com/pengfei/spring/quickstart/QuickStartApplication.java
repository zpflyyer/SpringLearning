package com.pengfei.spring.quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AliasFor;

import javax.annotation.Resources;

/**
 * Created by zhaopen on 12/28/2016.
 */
@ComponentScan
@Configuration
public class QuickStartApplication {

    @Bean(name = "MesServ,@123")
    public  MessgeService mockkMessageServie(){
        return new MessgeService() {
            public String getMessage() {
                return "Hello!";
            }
        };
    }
    private  MessagePrinter messagePrinter;
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(QuickStartApplication.class);
        context.getBean(MessagePrinter.class).printMessage();
    }
}

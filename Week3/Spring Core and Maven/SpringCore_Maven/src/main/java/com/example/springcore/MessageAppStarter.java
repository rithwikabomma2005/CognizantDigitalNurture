package com.example.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageAppStarter {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppMessageConfig.class);
        MessageService service = context.getBean(MessageService.class);
        service.sendMessage();
    }
}

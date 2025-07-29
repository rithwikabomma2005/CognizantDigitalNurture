package com.example.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);

        GreetingApp app = context.getBean(GreetingApp.class);
        app.startGreeting();
    }
}

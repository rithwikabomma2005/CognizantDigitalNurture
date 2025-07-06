package com.example.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex7Runner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ex7-config.xml");

        Traveller traveller = context.getBean("traveller", Traveller.class);
        traveller.startJourney();
    }
}

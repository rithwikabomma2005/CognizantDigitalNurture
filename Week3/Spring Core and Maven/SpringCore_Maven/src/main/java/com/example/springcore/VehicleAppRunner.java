package com.example.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleAppRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("vehicle-config.xml");
        Vehicle vehicle = (Vehicle) context.getBean("vehicle");
        vehicle.move();
    }
}

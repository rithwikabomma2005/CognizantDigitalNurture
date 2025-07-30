package com.example.springcore;

public class GreetingApp {
    private GreetingService greetingService;

    // Constructor Injection
    public GreetingApp(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // Setter Injection
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void startGreeting() {
        greetingService.greet();
    }
}

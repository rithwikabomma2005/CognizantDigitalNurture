package com.example.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DIConfig {

    @Bean
    public GreetingService greetingService() {
        return new EnglishGreetingService();
    }

    @Bean
    public GreetingApp greetingApp() {
        // Constructor Injection
        return new GreetingApp(greetingService());

        // OR for Setter Injection:
        /*
        GreetingApp app = new GreetingApp(null);
        app.setGreetingService(greetingService());
        return app;
        */
    }
}

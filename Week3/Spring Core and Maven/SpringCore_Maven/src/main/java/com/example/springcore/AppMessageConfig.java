package com.example.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppMessageConfig {

    @Bean
    public MessageService messageService() {
        return new EveningMessageService();
    }
}

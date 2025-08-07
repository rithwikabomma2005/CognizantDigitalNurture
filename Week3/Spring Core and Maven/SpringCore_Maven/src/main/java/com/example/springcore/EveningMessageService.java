package com.example.springcore;

public class EveningMessageService implements MessageService {

    @Override
    public void sendMessage() {
        System.out.println("Good Evening from Spring Maven Project!");
    }
}

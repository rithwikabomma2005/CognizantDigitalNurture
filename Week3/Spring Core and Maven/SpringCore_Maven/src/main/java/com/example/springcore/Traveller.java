package com.example.springcore;

public class Traveller {
    private Transport transport;

    // Constructor injection
    public Traveller(Transport transport) {
        this.transport = transport;
    }

    // Setter injection
    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void startJourney() {
        transport.move();
    }
}

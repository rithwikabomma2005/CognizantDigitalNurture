package com.example;

public class Country {
    private String name;
    private String capital;

    // Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }

    // toString method for display
    @Override
    public String toString() {
        return "Country [name=" + name + ", capital=" + capital + "]";
    }
}

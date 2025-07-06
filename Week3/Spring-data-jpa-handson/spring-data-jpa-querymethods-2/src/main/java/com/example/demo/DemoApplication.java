package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private CountryRepository countryRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        countryRepository.save(new Country("India", "New Delhi"));
        countryRepository.save(new Country("USA", "Washington"));
        countryRepository.save(new Country("France", "Paris"));

        System.out.println("HQL - Capital Paris:");
        countryRepository.findByCapitalHQL("Paris")
                .forEach(System.out::println);

        System.out.println("Native - Name India:");
        countryRepository.findByNameNative("India")
                .forEach(System.out::println);
    }
}

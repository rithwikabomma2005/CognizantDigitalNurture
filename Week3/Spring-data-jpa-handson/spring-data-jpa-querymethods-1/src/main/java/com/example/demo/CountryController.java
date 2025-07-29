package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryRepository repository;

    @PostMapping("/add")
    public Country addCountry(@RequestBody Country country) {
        return repository.save(country);
    }

    @GetMapping("/all")
    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    @GetMapping("/name/{name}")
    public List<Country> getByName(@PathVariable String name) {
        return repository.findByName(name);
    }

    @GetMapping("/capital/{capital}")
    public List<Country> getByCapital(@PathVariable String capital) {
        return repository.findByCapital(capital);
    }
}

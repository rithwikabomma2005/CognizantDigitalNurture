package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/new-countries")  // Avoids conflict with existing ones
public class AddCountryController {

    @Autowired
    private AddCountryRepository repository;

    @PostMapping
    public AddCountryEntity addCountry(@RequestBody AddCountryEntity country) {
        return repository.save(country);
    }

    @GetMapping("/{code}")
    public AddCountryEntity getCountry(@PathVariable String code) {
        return repository.findById(code).orElse(null);
    }
}

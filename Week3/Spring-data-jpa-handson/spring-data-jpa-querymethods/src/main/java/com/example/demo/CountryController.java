package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return countryRepository.save(country);
    }

    @GetMapping
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @GetMapping("/name/{name}")
    public List<Country> getByName(@PathVariable String name) {
        return countryRepository.findByName(name);
    }

    @GetMapping("/capital/{capital}")
    public List<Country> getByCapital(@PathVariable String capital) {
        return countryRepository.findByCapital(capital);
    }

    @GetMapping("/name-contains/{keyword}")
    public List<Country> getByNameContaining(@PathVariable String keyword) {
        return countryRepository.findByNameContaining(keyword);
    }

    @GetMapping("/name-starts/{prefix}")
    public List<Country> getByNameStartingWith(@PathVariable String prefix) {
        return countryRepository.findByNameStartingWith(prefix);
    }

    @GetMapping("/capital-ends/{suffix}")
    public List<Country> getByCapitalEndingWith(@PathVariable String suffix) {
        return countryRepository.findByCapitalEndingWith(suffix);
    }
}

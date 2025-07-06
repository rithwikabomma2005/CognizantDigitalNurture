package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    // ➕ Add a new country
    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return countryRepository.save(country);
    }

    // 🔍 Get country by code with custom message
    @GetMapping("/{code}")
    public String getCountryByCode(@PathVariable String code) {
        Optional<Country> country = countryRepository.findById(code);
        if (country.isPresent()) {
            Country found = country.get();
            return "✅ Found: " + found.getName() + " (" + found.getCode() + ")";
        } else {
            return "❌ Country not found for code: " + code;
        }
    }

    // 📋 Get all countries
    @GetMapping
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    // 🗑️ Delete country by code
    @DeleteMapping("/{code}")
    public void deleteCountry(@PathVariable String code) {
        countryRepository.deleteById(code);
    }
}

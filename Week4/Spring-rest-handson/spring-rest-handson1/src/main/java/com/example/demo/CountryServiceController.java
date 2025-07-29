package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryServiceController {

    // Simulated in-memory database
    private static final Map<String, Country> countryMap = new HashMap<>();

    static {
        countryMap.put("US", new Country("US", "United States"));
        countryMap.put("CA", new Country("CA", "Canada"));
        countryMap.put("JP", new Country("JP", "Japan"));
        countryMap.put("FR", new Country("FR", "France"));
        countryMap.put("AU", new Country("AU", "Australia"));
    }

    @GetMapping("/get-country/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        return countryMap.getOrDefault(code.toUpperCase(), new Country(code, "Country Not Found"));
    }
}


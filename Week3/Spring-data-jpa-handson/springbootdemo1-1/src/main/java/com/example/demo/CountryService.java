package com.example.demo;

import java.util.List;

public interface CountryService {
    List<Country> getAllCountries();
    Country getCountryById(Long id);
    Country createCountry(Country country);
    Country updateCountry(Long id, Country updatedCountry);
    void deleteCountry(Long id);
}

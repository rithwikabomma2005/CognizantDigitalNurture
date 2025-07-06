package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Optional<Country> getCountryById(Long id) {
        return countryRepository.findById(id);
    }

    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    public Country updateCountry(Long id, Country newDetails) {
        Country existing = countryRepository.findById(id).orElseThrow();
        existing.setName(newDetails.getName());
        existing.setCapital(newDetails.getCapital());
        return countryRepository.save(existing);
    }

    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
    }
}

package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository repository;

    public CountryServiceImpl(CountryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    @Override
    public Country getCountryById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Country not found"));
    }

    @Override
    public Country createCountry(Country country) {
        return repository.save(country);
    }

    @Override
    public Country updateCountry(Long id, Country updatedCountry) {
        Country existing = getCountryById(id);
        existing.setName(updatedCountry.getName());
        existing.setCapital(updatedCountry.getCapital());
        existing.setContinent(updatedCountry.getContinent());
        return repository.save(existing);
    }

    @Override
    public void deleteCountry(Long id) {
        repository.deleteById(id);
    }
}

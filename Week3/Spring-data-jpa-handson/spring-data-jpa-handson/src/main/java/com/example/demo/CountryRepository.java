package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
}

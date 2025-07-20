package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

// This interface enables query method features
public interface CountryRepository extends JpaRepository<Country, Long> {

    // Query methods based on method names
    List<Country> findByName(String name);
    List<Country> findByCapital(String capital);
    List<Country> findByNameContaining(String keyword);
    List<Country> findByNameStartingWith(String prefix);
    List<Country> findByCapitalEndingWith(String suffix);
}

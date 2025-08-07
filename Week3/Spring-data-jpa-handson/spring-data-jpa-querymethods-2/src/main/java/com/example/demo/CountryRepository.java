package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {

    // HQL (JPQL)
    @Query("FROM Country WHERE capital = :capital")
    List<Country> findByCapitalHQL(@Param("capital") String capital);

    // Native SQL
    @Query(value = "SELECT * FROM country WHERE name = :name", nativeQuery = true)
    List<Country> findByNameNative(@Param("name") String name);
}

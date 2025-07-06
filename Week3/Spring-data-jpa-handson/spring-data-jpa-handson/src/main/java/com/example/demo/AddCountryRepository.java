package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;

public interface AddCountryRepository extends JpaRepository<AddCountryEntity, String> {
}

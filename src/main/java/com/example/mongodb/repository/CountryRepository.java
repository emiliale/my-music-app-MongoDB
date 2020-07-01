package com.example.mongodb.repository;

import com.example.mongodb.model.Artist;
import com.example.mongodb.model.Country;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CountryRepository extends MongoRepository<Country, String> {

    public Country findByCountryName(String countryName);

}

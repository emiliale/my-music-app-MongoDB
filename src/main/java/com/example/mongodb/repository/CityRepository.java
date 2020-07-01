package com.example.mongodb.repository;

import com.example.mongodb.model.Artist;
import com.example.mongodb.model.City;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CityRepository extends MongoRepository<City, String> {

    public City findByCityName(String cityName);

}

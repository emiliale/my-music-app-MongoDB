package com.example.mongodb.service;

import com.example.mongodb.model.City;
import com.example.mongodb.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    //Create operation
    public City create(String cityName) {
        return cityRepository.save(new City(cityName));
    }

    //Retrieve operation
    public List<City> getAll(){
        return cityRepository.findAll();
    }

    public City getByCityName(String cityName) {
        return cityRepository.findByCityName(cityName);
    }

    //Update operation
    public City update(String cityName) {
        City c = cityRepository.findByCityName(cityName);
        c.setCityName(cityName);
        return cityRepository.save(c);
    }

    //Delete operation
    public void deleteAll() {
        cityRepository.deleteAll();
    }

    public void delete(String cityName) {
        City c = cityRepository.findByCityName(cityName);
        cityRepository.delete(c);
    }


}

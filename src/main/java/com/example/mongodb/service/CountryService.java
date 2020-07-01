package com.example.mongodb.service;

import com.example.mongodb.model.City;
import com.example.mongodb.model.Country;
import com.example.mongodb.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    //Create operation
    public Country create(String countryName, List<City> listOfCities) {
        return countryRepository.save(new Country(countryName, listOfCities));
    }

    //Retrieve operation
    public List<Country> getAll(){
        return countryRepository.findAll();
    }

    public Country getByCountryName(String countryName) {
        return countryRepository.findByCountryName(countryName);
    }

    //Update operation
    public Country update(String countryName, List<City> listOfCities) {
        Country c = countryRepository.findByCountryName(countryName);
        c.setListofCity(listOfCities);
        return countryRepository.save(c);
    }

    //Delete operation
    public void deleteAll() {
        countryRepository.deleteAll();
    }
    public void delete(String countryName) {
        Country c = countryRepository.findByCountryName(countryName);
        countryRepository.delete(c);
    }
}

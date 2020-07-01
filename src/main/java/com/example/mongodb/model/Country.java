package com.example.mongodb.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Country {

    @Id
    private String id;

    private String countryName;
    private List<City> listofCites;

    public Country(String countryName, List<City> listofCity) {
        this.countryName = countryName;
        this.listofCites = listofCites;
    }

    public List<City> getListofCity() {
        return listofCites;
    }

    public void setListofCity(List<City> listofCity) {
        this.listofCites = listofCity;
    }

    public String getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}

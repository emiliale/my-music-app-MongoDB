package com.example.mongodb.model;

import org.springframework.data.annotation.Id;

public class Location {

    @Id
    private String id;

    private String locationName;
    private City city;
    private String address;
    private String phoneNumber;
    private int capacity;
    private String webPage;
    private String description;

    public Location(String locationName, City city, String address, String phoneNumber, int capacity, String webPage, String description) {
        this.locationName = locationName;
        this.city = city;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.capacity = capacity;
        this.webPage = webPage;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

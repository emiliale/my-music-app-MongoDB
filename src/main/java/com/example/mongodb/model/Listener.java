package com.example.mongodb.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;
import java.util.Calendar;

@Document
public class Listener extends User{

    @Id
    private String id;

    private String surname;
    private String email;
    private String password;
    private Date birthDetails;
    private City city;


    public Listener(String name, String surname, String phoneNumber, String email, String password, Date birthDetails, City city) {
        super(name, phoneNumber);
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.birthDetails =birthDetails;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthDetails() {
        return birthDetails;
    }

    public void setBirthDetails(Date birthDetails) {
        this.birthDetails = birthDetails;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format(
                "Listener[id=%s, surname='%s', email='%s', password='%s', birthDetails='%s', city='%s']",
                id, email, password, birthDetails, city);
    }

    public int CalcAge(){
        Date today = (Date) Calendar.getInstance().getTime();
        Date birthDay = getBirthDetails();

        return today.getYear() -  birthDay.getYear();
    }


}

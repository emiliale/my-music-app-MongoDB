package com.example.mongodb.service;


import com.example.mongodb.model.City;
import com.example.mongodb.model.Listener;
import com.example.mongodb.repository.ListenerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

@Service
public class ListenerService {

    @Autowired
    private ListenerRepository listenerRepository;

    //Create operation
    public Listener create(String name, String surname, String phoneNumber, String email, String password, Date birthDetails, City city) {
        return listenerRepository.save(new Listener(name, surname, phoneNumber, email, password, birthDetails, city));
    }

    //Retrieve operation
    public List<Listener> getAll(){
        return listenerRepository.findAll();
    }
    public Listener getBySurname(String surname) {
        return listenerRepository.findBySurname(surname);
    }
    //Update operation
    public Listener update(String name, String surname, String phoneNumber, String email, String password, Date birthDetails, City city) {
        Listener l = listenerRepository.findBySurname(surname);
        l.setName(name);
        l.setEmail(email);
        l.setPhoneNumber(phoneNumber);
        l.setPassword(password);
        l.setBirthDetails(birthDetails);
        l.setCity(city);
        return listenerRepository.save(l);
    }
    //Delete operation
    public void deleteAll() {
        listenerRepository.deleteAll();
    }
    public void delete(String surname) {
        Listener l = listenerRepository.findBySurname(surname);
        listenerRepository.delete(l);
    }
}
package com.example.mongodb.service;

import com.example.mongodb.model.City;
import com.example.mongodb.model.Listener;
import com.example.mongodb.model.Organizer;
import com.example.mongodb.repository.ListenerRepository;
import com.example.mongodb.repository.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class OrganizerService {

    @Autowired
    private OrganizerRepository organizerRepository;

    //Create operation
    public Organizer create(String organizerName, String phoneNumber, String NIP) {
        return organizerRepository.save(new Organizer(organizerName, phoneNumber, NIP));
    }

    //Retrieve operation
    public List<Organizer> getAll(){
        return organizerRepository.findAll();
    }

    public Organizer getByOrganizerName(String organizerName) {
        return organizerRepository.findByOrganizerName(organizerName);
    }

    //Update operation
    public Organizer update(String organizerName, String phoneNumber, String NIP) {
        Organizer o = organizerRepository.findByOrganizerName(organizerName);
        o.setPhoneNumber(phoneNumber);
        o.setNIP(NIP);

        return organizerRepository.save(o);
    }
    //Delete operation
    public void deleteAll() {
        organizerRepository.deleteAll();
    }

    public void delete(String organizerName) {
        Organizer o = organizerRepository.findByOrganizerName(organizerName);
        organizerRepository.delete(o);
    }
}

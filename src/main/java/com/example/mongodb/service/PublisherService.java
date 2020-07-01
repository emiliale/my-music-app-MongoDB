package com.example.mongodb.service;

import com.example.mongodb.model.City;
import com.example.mongodb.model.Listener;
import com.example.mongodb.model.Publisher;
import com.example.mongodb.repository.ListenerRepository;
import com.example.mongodb.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    //Create operation
    public Publisher create(String publisherName) {
        return publisherRepository.save(new Publisher(publisherName));
    }

    //Retrieve operation
    public List<Publisher> getAll(){
        return publisherRepository.findAll();
    }

    public Publisher getByPublisherName(String publisherName) {
        return publisherRepository.findByPublisherName(publisherName);
    }
    //Update operation
    public Publisher update(String publisherName) {
        Publisher p = publisherRepository.findByPublisherName(publisherName);
        return publisherRepository.save(p);
    }
    //Delete operation
    public void deleteAll() {
        publisherRepository.deleteAll();
    }

    public void delete(String publisherName) {
        Publisher p = publisherRepository.findByPublisherName(publisherName);
        publisherRepository.delete(p);
    }
}

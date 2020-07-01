package com.example.mongodb.repository;

import com.example.mongodb.model.Listener;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ListenerRepository extends MongoRepository<Listener, String>{

    public Listener findBySurname(String surname);
    public List<Listener> findByEmail(String email);
}

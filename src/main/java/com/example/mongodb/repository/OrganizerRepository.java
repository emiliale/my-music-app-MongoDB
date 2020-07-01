package com.example.mongodb.repository;

import com.example.mongodb.model.Organizer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrganizerRepository extends MongoRepository<Organizer, String> {

    public Organizer findByOrganizerName(String organizerName);

}

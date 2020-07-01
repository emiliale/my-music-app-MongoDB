package com.example.mongodb.repository;

import com.example.mongodb.model.Artist;
import com.example.mongodb.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {

    public Event findByEventName(String eventName);

}

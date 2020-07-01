package com.example.mongodb.repository;

import com.example.mongodb.model.Publisher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PublisherRepository extends MongoRepository<Publisher, String> {

    public Publisher findByPublisherName(String publisherName);

}

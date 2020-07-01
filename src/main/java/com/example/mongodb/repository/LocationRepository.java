package com.example.mongodb.repository;

import com.example.mongodb.model.Listener;
import com.example.mongodb.model.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationRepository extends MongoRepository<Location, String> {

    public Location findByLocationName(String locationName);

}

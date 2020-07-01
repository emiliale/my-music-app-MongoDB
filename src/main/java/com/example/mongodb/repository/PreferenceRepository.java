package com.example.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.mongodb.model.Preference;


public interface PreferenceRepository extends MongoRepository<Preference, String> {

    public Preference findByPreferenceName(String preferenceName);
}

package com.example.mongodb.repository;

import com.example.mongodb.model.Artist;
import com.example.mongodb.model.Performance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PerformanceRepository extends MongoRepository<Performance, String> {

    public Performance findByPerformanceName(String performanceName);

}

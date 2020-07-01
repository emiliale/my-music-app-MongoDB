package com.example.mongodb.service;

import com.example.mongodb.model.*;
import com.example.mongodb.repository.PerformanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Service
public class PerformanceService {

    @Autowired
    private PerformanceRepository performanceRepository;

    //Create operation
    public Performance create(String performanceName, Artist artist, Event event, Date startDate, Time startTime, Date endDate, Time endTime) {
        return performanceRepository.save(new Performance(performanceName, artist, event, startDate, startTime, endDate, endTime));
    }

    //Retrieve operation
    public List<Performance> getAll(){
        return performanceRepository.findAll();
    }
    public Performance getByPerformance(String performanceName) {
        return performanceRepository.findByPerformanceName(performanceName);
    }

    //Update operation
    public Performance update(String performanceName, Artist artist, Event event, Date startDate, Time startTime, Date endDate, Time endTime) {
        Performance p = performanceRepository.findByPerformanceName(performanceName);
        p.setArtist(artist);
        p.setEvent(event);
        p.setStartDate(startDate);
        p.setStartTime(startTime);
        p.setEndDate(endDate);
        p.setEndTime(endTime);
        return performanceRepository.save(p);
    }
    //Delete operation
    public void deleteAll() {
        performanceRepository.deleteAll();
    }
    public void delete(String performanceName) {
        Performance p = performanceRepository.findByPerformanceName(performanceName);
        performanceRepository.delete(p);
    }
}

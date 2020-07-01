package com.example.mongodb.service;

import com.example.mongodb.model.*;
import com.example.mongodb.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    //Create operation
    public Event create(String eventName, Organizer organizer, String type, Date startDate, Time startTime, Date endDate, Time endTime, int ageLimit, Location location) {
        return eventRepository.save(new Event(eventName, organizer, type, startDate, startTime, endDate, endTime, ageLimit, location));
    }

    //Retrieve operation
    public List<Event> getAll(){
        return eventRepository.findAll();
    }

    public Event getByEventName(String eventName) {
        return eventRepository.findByEventName(eventName);
    }

    //Update operation
    public Event update(String eventName, Organizer organizer, String type, Date startDate, Time startTime, Date endDate, Time endTime, int ageLimit, Location location) {
        Event l = eventRepository.findByEventName(eventName);
        l.setOrganizer(organizer);
        l.setType(type);
        l.setStartDate(startDate);
        l.setStartTime(startTime);
        l.setEndDate(endDate);
        l.setEndTime(endTime);
        l.setAgeLimit(ageLimit);
        l.setLocation(location);

        return eventRepository.save(l);
    }

    //Delete operation
    public void deleteAll() {
        eventRepository.deleteAll();
    }

    public void delete(String eventName) {
        Event e = eventRepository.findByEventName(eventName);
        eventRepository.delete(e);
    }
}

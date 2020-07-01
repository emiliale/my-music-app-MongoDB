package com.example.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;
import java.sql.Time;
import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;

@Document
public class Event {

    @Id
    private String id;

    private String eventName;
    private Organizer organizer;
    private String type;
    private Date startDate;
    private Time startTime;
    private Date endDate;
    private Time endTime;
    private int ageLimit;
    private Location location;

    public Event(String eventName, Organizer organizer, String type, Date startDate, Time startTime, Date endDate, Time endTime, int ageLimit, Location location) {
        this.eventName = eventName;
        this.organizer = organizer;
        this.type = type;
        this.startDate = startDate;
        this.startTime = startTime;
        this.endDate = endDate;
        this.endTime = endTime;
        this.ageLimit = ageLimit;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int CalcDurationDays(){
        LocalDate start = getStartDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate end = getEndDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        Duration diff = Duration.between(start, end);

        return (int) diff.toDays();
    }

}

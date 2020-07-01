package com.example.mongodb.model;

import org.springframework.data.annotation.Id;

public class Publisher {

    @Id
    private String id;

    private String publisherName;

    public Publisher(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getId() {
        return id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
}

package com.example.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Organizer extends User{

    @Id
    private String id;

    private String organizerName;
    private String NIP;

    public Organizer(String organizerName, String phoneNumber, String NIP) {
        super(organizerName, phoneNumber);
        this.NIP = NIP;
    }

    public String getId() {
        return id;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

}

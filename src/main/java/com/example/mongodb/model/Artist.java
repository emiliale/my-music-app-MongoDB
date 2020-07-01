package com.example.mongodb.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Artist {

    @Id
    private String id;

    private String artistName;
    private Publisher publisher;
    private Country country;
    private String photo;
    private String description;
    private Genre genre;

    public Artist(String artistName, Publisher publisher, Genre genre, Country country, String photo, String description) {
        this.artistName = artistName;
        this.publisher = publisher;
        this.genre = genre;
        this.country = country;
        this.photo = photo;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        description = description;
    }
}

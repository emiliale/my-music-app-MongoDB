package com.example.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Preference {

    @Id
    private String id;

    private String preferenceName;
    private Listener listener;
    private List<Genre> listOfGenre;
    private List<City> listOfCity;
    private List<Artist> listofArtist;

    public Preference(String preferenceName, Listener listener, List<Genre> listOfGenre, List<City> listOfCity, List<Artist> listofArtist) {
        this.preferenceName = preferenceName;
        this.listener = listener;
        this.listOfGenre = listOfGenre;
        this.listOfCity = listOfCity;
        this.listofArtist = listofArtist;
    }

    public String getId() {
        return id;
    }

    public String getPreferenceName() {
        return preferenceName;
    }

    public void setPreferenceName(String preferenceName) {
        this.preferenceName = preferenceName;
    }

    public Listener getListener() {
        return listener;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public List<Genre> getListOfGenre() {
        return listOfGenre;
    }

    public void setListOfGenre(List<Genre> listOfGenre) {
        this.listOfGenre = listOfGenre;
    }

    public List<City> getListOfCity() {
        return listOfCity;
    }

    public void setListOfCity(List<City> listOfCity) {
        this.listOfCity = listOfCity;
    }

    public List<Artist> getListofArtist() {
        return listofArtist;
    }

    public void setListofArtist(List<Artist> listofArtist) {
        this.listofArtist = listofArtist;
    }
}

package com.example.mongodb.service;

import com.example.mongodb.model.*;
import com.example.mongodb.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    //Create operation
    public Artist create(String artistName, Publisher publisher, Genre genre, Country country, String photo, String description) {
        return artistRepository.save(new Artist(artistName, publisher, genre, country, photo, description));
    }

    //Retrieve operation
    public List<Artist> getAll(){
        return artistRepository.findAll();
    }
    public Artist getByArtistName(String artistName) {
        return artistRepository.findByArtistName(artistName);
    }

    //Update operation
    public Artist update(String artistName, Publisher publisher, Genre genre, Country country, String photo, String description) {
        Artist a = artistRepository.findByArtistName(artistName);
        a.setPublisher(publisher);
        a.setGenre(genre);
        a.setCountry(country);
        a.setPhoto(photo);
        a.setDescription(description);
        return artistRepository.save(a);
    }
    //Delete operation
    public void deleteAll() {
        artistRepository.deleteAll();
    }

    public void delete(String artistName) {
        Artist a = artistRepository.findByArtistName(artistName);
        artistRepository.delete(a);
    }
}

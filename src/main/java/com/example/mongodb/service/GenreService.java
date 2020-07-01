package com.example.mongodb.service;

import com.example.mongodb.model.City;
import com.example.mongodb.model.Genre;
import com.example.mongodb.model.Listener;
import com.example.mongodb.repository.GenreRepository;
import com.example.mongodb.repository.ListenerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;

    //Create operation
    public Genre create(String genreName) {
        return genreRepository.save(new Genre(genreName));
    }

    //Retrieve operation
    public List<Genre> getAll(){
        return genreRepository.findAll();
    }

    public Genre getByGenreName(String genreName) {
        return genreRepository.findByGenreName(genreName);
    }

    //Update operation
    public Genre update(String genreName) {
        Genre g = genreRepository.findByGenreName(genreName);
        return genreRepository.save(g);
    }
    //Delete operation
    public void deleteAll() {
        genreRepository.deleteAll();
    }

    public void delete(String genreName) {
        Genre g = genreRepository.findByGenreName(genreName);
        genreRepository.delete(g);
    }
}

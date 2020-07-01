package com.example.mongodb.repository;

import com.example.mongodb.model.City;
import com.example.mongodb.model.Genre;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GenreRepository extends MongoRepository<Genre, String> {

    public Genre findByGenreName(String genreName);

}

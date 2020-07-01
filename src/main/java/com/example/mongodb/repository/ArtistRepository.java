package com.example.mongodb.repository;

import com.example.mongodb.model.Artist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArtistRepository extends MongoRepository<Artist, String> {

    public Artist findByArtistName(String artistName);
}

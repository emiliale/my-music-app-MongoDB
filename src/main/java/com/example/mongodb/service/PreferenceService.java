package com.example.mongodb.service;

import com.example.mongodb.model.*;
import com.example.mongodb.repository.PerformanceRepository;
import com.example.mongodb.repository.PreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Service
public class PreferenceService {

    @Autowired
    private PreferenceRepository preferenceRepository;

    //Create operation
    public Preference create(String preferenceName, Listener listener, List<Genre> listOfGenre, List<City> listOfCity, List<Artist> listofArtist) {
        return preferenceRepository.save(new Preference(preferenceName, listener, listOfGenre, listOfCity, listofArtist));
    }

    //Retrieve operation
    public List<Preference> getAll(){
        return preferenceRepository.findAll();
    }
    public Preference getByPreference(String preferenceName) {
        return preferenceRepository.findByPreferenceName(preferenceName);
    }

    //Update operation
    public Preference update(String preferenceName, Listener listener, List<Genre> listOfGenre, List<City> listOfCity, List<Artist> listofArtist) {
        Preference p = preferenceRepository.findByPreferenceName(preferenceName);
        p.setListener(listener);
        p.setListOfGenre(listOfGenre);
        p.setListOfCity(listOfCity);
        p.setListofArtist(listofArtist);
        return preferenceRepository.save(p);
    }
    //Delete operation
    public void deleteAll() {
        preferenceRepository.deleteAll();
    }
    public void delete(String preferenceName) {
        Preference p = preferenceRepository.findByPreferenceName(preferenceName);
        preferenceRepository.delete(p);
    }
}

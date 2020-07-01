package com.example.mongodb.config;

import com.example.mongodb.model.Listener;
import com.example.mongodb.repository.ListenerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.sql.Date;
import java.util.Calendar;

@EnableMongoRepositories(basePackageClasses = ListenerRepository.class)
@Configuration
public class MongoDBConfig  {


    @Bean
    CommandLineRunner commandLineRunner(ListenerRepository userRepository) {
        return strings -> {
            //userRepository.save(new Listener("Jones", "886888594", "jones@gmail.com", "jon123", new Date(1998, 3,2), "New York"));
            //userRepository.save(new Listener("York", "103875039", "york.charlotte@sth.com", "adminhehh", new Date(1988, 11,12), "Los Angeles"));
        };
    }

}

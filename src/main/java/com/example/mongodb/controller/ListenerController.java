package com.example.mongodb.controller;

import com.example.mongodb.model.City;
import com.example.mongodb.model.Listener;
import com.example.mongodb.service.ListenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

@RestController
public class ListenerController {

    @Autowired
    private ListenerService listenerService;


    @RequestMapping("/create")
    public String create(@RequestParam String name, @RequestParam String surname, @RequestParam String phoneNumber, @RequestParam String email, @RequestParam String password, @RequestParam Date birthDetails, @RequestParam City city) {
        Listener l = listenerService.create(name, surname, phoneNumber, email, password, birthDetails, city);
        return l.toString();
    }

    @RequestMapping("/get")
    public Listener getListener(@RequestParam String surname) {
        return listenerService.getBySurname(surname);
    }
    @RequestMapping("/getAll")
    public List<Listener> getAll(){
        return listenerService.getAll();
    }
    @RequestMapping("/update")
    public String update(@RequestParam String name, @RequestParam String surname, @RequestParam String phoneNumber, @RequestParam String email, @RequestParam String password, @RequestParam Date birthDetails, @RequestParam City city) {
        Listener l = listenerService.update(name, surname, phoneNumber, email, password, birthDetails, city);
        return l.toString();
    }
    @RequestMapping("/delete")
    public String delete(@RequestParam String surname) {
        listenerService.delete(surname);
        return "Deleted "+surname;
    }
    @RequestMapping ("/deleteAll")
    public String deleteAll() {
        listenerService.deleteAll();
        return "Deleted all records";
    }
}

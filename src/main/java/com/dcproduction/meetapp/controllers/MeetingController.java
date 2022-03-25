package com.dcproduction.meetapp.controllers;

import java.util.List;

import com.dcproduction.meetapp.classes.Meeting;
import com.dcproduction.meetapp.repositories.MeetingRepository;
import com.dcproduction.meetapp.services.MeetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//creating the rest API. url commands call commands on the repository
@RestController
// @CrossOrigin("*")
@RequestMapping("test/hello")
public class MeetingController {
    
    @Autowired
    MeetingService service;
    // MeetingRepository meetingDB;

    @GetMapping
    public List<Meeting> fetchAllMeetings() {
        System.out.println("RETURNING ALL MEETINGS");
        return service.getAllMeetings();
        // return this.meetingDB.findAll();
    }
    

}

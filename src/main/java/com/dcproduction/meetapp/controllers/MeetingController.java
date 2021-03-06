package com.dcproduction.meetapp.controllers;

import java.util.List;

import com.dcproduction.meetapp.classes.Meeting;
import com.dcproduction.meetapp.classes.User;
import com.dcproduction.meetapp.repositories.MeetingRepository;
import com.dcproduction.meetapp.services.MeetingService;

import org.bson.json.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//creating the rest API. url commands call commands on the repository
// @CrossOrigin("*")
@RestController
@RequestMapping("test/hello")
public class MeetingController {
    
    @Autowired
    MeetingService service;

    @Autowired
    MeetingRepository meetingDB;

    @GetMapping
    public List<Meeting> fetchAllMeetings() {
        System.out.println("RETURNING ALL MEETINGS");
        return service.getAllMeetings();
        // return this.meetingDB.findAll();
    }
    
    @GetMapping("/findmeeting")
    public Meeting findMeeting() {
        System.out.println("FINDING MEETING");
        return service.findMeeting("test meeting");
        // return this.meetingDB.findAll();
    }


    // @GetMapping("/finduser") //TEMPORARY make this call from service, not from db
    // String findUser() {
    //     System.out.println("FINDING USER");
    //     return meetingDB.findUsers("test meeting");
    //     // return this.meetingDB.findAll();
    // }

    @GetMapping("/finduser") //TEMPORARY make this call from service, not from db
    String findUser() { 
        System.out.println("FINDING USER");

        return meetingDB.findUsers("test meeting");
        // return this.meetingDB.findAll();
    }

 
    
    // @GetMapping("/finduser")
    // public List<User> findUser() {
    //     System.out.println("FINDING USER");
    //     return service.findUsers("test meeting");
    //     // return this.meetingDB.findAll();
    // }
}

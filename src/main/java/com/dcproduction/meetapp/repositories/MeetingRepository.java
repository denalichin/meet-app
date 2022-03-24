package com.dcproduction.meetapp.repositories;

import com.dcproduction.meetapp.classes.Meeting;
import org.springframework.data.mongodb.repository.MongoRepository;


//must be an interface
//extends MongoRepository
// @Repository;
public interface MeetingRepository extends MongoRepository<Meeting, String> {
    // public Meeting getById(String id);

    //findById may return a null, while getById always returns an object, even if entry doesn't exist
}

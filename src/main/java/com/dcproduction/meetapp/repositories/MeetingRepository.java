package com.dcproduction.meetapp.repositories;

import com.dcproduction.meetapp.classes.Meeting;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


//must be an interface
//extends MongoRepository
// @Component
@Repository
public interface MeetingRepository extends MongoRepository<Meeting, String> {
    // public Meeting getById(String id);

    //findById may return a null, while getById always returns an object, even if entry doesn't exist
}

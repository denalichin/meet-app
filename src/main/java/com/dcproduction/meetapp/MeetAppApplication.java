package com.dcproduction.meetapp;

import com.dcproduction.meetapp.classes.GroceryItem;
import com.dcproduction.meetapp.classes.Meeting;
import com.dcproduction.meetapp.repositories.ItemRepository;
import com.dcproduction.meetapp.repositories.MeetingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeetAppApplication implements CommandLineRunner{

	@Autowired
    // ItemRepository Testeroni;
	MeetingRepository MeetingDB;
	public static void main(String[] args) {
		SpringApplication.run(MeetAppApplication.class, args);
	}

	//When running the application, here is where we can initailize some test data
	@Override
	public void run(String... args) throws Exception {

		MeetingDB.save(new Meeting("first_id", "String name", 99, "category"));

		// System.out.println("Clearing db");
		// Testeroni.deleteAll();

		// System.out.println("Data creation started...");
        // Testeroni.save(new GroceryItem("first_id", "Whole Wheat Biscuit", 5, "snacks"));
		// Testeroni.save(new GroceryItem("second_id", "Whole Wheat Biscuit", 5, "snacks"));
		// Testeroni.save(new GroceryItem("third_id", "Whole Wheat Biscuit", 5, "snacks"));
		// Testeroni.save(new GroceryItem("fourth_id", "Whole Wheat Biscuit", 5, "snacks"));

	}

}

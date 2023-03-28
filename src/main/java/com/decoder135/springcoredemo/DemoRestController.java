package com.decoder135.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor for the dependency injection

    @Autowired
    public DemoRestController(Coach theCoach) {
        myCoach = theCoach;
    }

    public String getDailyWorkout() {

    }

}

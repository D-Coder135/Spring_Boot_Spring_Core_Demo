package com.decoder135.springcoredemo.rest;

import com.decoder135.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor for the dependency injection

    @Autowired
    public DemoRestController(/*@Qualifier("baseballCoach")*/ Coach theCoach) {
        myCoach = theCoach;
    }

    // define a setter method for performing the setter injection using the @Autowired annotation
//    @Autowired
//    public void setCoach(Coach theCoach) {
//        myCoach = theCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}

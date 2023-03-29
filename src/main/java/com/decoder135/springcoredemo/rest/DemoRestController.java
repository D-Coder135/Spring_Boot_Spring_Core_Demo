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
    private Coach anotherCoach;

    // define a constructor for the dependency injection

    // NOTE: The default scope for a bean is always Singleton, i.e., All dependency injections for the bean will
    // reference the SAME bean instance.
    @Autowired
    public DemoRestController(@Qualifier("baseballCoach") Coach theCoach,
                              @Qualifier("baseballCoach") Coach theAnotherCoach) {
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
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

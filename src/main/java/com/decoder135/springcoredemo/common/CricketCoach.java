package com.decoder135.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// For Prototype scope of a bean, a new object instance is created for each injection.
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{

    // define our init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    }
    // define our destroy method

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes daily.";
    }
}

package com.decoder135.springcoredemo.config;

import com.decoder135.springcoredemo.common.Coach;
import com.decoder135.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}

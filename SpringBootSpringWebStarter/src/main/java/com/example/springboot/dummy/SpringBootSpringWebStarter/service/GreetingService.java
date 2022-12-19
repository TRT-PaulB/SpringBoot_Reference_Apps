package com.example.springboot.dummy.SpringBootSpringWebStarter.service;

import com.example.springboot.dummy.SpringBootSpringWebStarter.ex.BadIdeaException;

import java.util.Arrays;
import java.util.List;

public class GreetingService {

    public static final String BUSINESS = "business";
    public static final String PERSONAL = "personal";
    protected static final List<String> VALID_CLASSIFICATIONS = Arrays.asList(PERSONAL, BUSINESS);

    public String getGreeting(int id, String type) {

        validateGreetingType(type);

        return "GOODDAY!";

    }

    protected void validateGreetingType(String type) {
        boolean isValid =
                VALID_CLASSIFICATIONS.stream().filter(s->s.equals(type)).findFirst().isPresent();
        if (!isValid) {
            throw new BadIdeaException("Invalid greeting classification");
        }
    }

}

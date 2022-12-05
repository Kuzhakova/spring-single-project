package com.example.springsingleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSingleProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSingleProjectApplication.class, args);
        System.out.println("Happiness can be found even in the darkest of times, " +
                "if one only remembers to turn on the light (c) Albus Dumbledore");
    }

}

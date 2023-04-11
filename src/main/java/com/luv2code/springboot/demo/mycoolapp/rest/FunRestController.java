package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for: jedi.name and planet.name
    @Value("${jedi.name}")
    private String jediName;

    @Value("${planet.name}")
    private String planetName;

    // expose new endpoint for "jediinfo"

    @GetMapping("/jediinfo")
    public String getJediInfo() {
        return "Jedi: " + jediName + ", Planet name: " + planetName;
    }

    // expose "/" endpoint that will return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5K!";
    }
}

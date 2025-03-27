package com.innostax.tracker.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UniController {

    @GetMapping("/home")
    public String home() {
        return "Working Good!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}

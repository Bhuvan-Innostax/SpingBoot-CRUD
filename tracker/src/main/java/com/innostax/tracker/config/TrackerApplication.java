package com.innostax.tracker.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.innostax.tracker") // Explicitly specify the root package to scan
public class TrackerApplication {

    public static void main(String[] args) {
        System.out.println("Project loading . . .");
        SpringApplication.run(TrackerApplication.class, args);
        System.out.println("Project running . . . ");
    }
}

package com.Shivam.SpringBootGradleProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShivamController {

    @GetMapping("/")
    public String hello() {
        return "Hello Shivam, your Spring Boot app is running on port 9090!";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Welcome to your Gradle-powered Spring Boot project!";
    }
}

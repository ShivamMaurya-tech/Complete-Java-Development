package com.Shivam.SpringBootMavenApplication.HelloController;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ShivamController {
    @GetMapping("/")
    public String hello() {
        return "Hello, Shivam! Your server is running!";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Welcome to your Spring Boot Maven Application!";
    }
}


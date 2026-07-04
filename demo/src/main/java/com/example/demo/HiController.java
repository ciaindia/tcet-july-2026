package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    // http://localhost:9090/hi
    @GetMapping("/hi")
    public String kuchbhi() {
        return "Hi, Welcome to Spring Boot";
    }

    @GetMapping("/")
    public String index() {
        return "Welcome to Spring Boot from slash";
    }
    //CW: Create REST API /calc 
    // with method GET POST PUT DELETE

    @GetMapping("/calc")
    public String calc() {
        return "I am from GET calc";
    }

    @PostMapping("/calc")
    public String calcPost() {
        return "I am from POST calc";
    }
    
}

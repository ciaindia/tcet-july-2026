package com.example.demo;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

    //Add 2 numbers using post num1 and num2 payload
    //    http://localhost:9090/calc?num1=5&num2=6

    @PostMapping("/calc")
    public String calcPost(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return String.valueOf(num1 + num2);
    }    

    @PostMapping("/sqr") 
    public String getSqr(@RequestBody Map<String, Integer> body)
    {
        int num = body.get("num");
        return String.valueOf(num*num);
    }

}

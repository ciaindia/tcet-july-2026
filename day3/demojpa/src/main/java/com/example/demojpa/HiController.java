package com.example.demojpa;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @GetMapping("/hi")
    public String sayHi() {
        return "Hi from hi controller";
    }

    //CW1: GET: Create api /sqr/5 which will print square of 5 i.e., 25
    @GetMapping("/sqr/{num}")
    public int getSqr(@PathVariable int num) {        
        return num * num;
    }

    //CW2: POST: WAP to read 2 numbers from req body in json format and print multiplication
    @PostMapping("/mul")
    public int getMul(@RequestBody Map<String, Integer> body){
        int n1 = body.get("n1");
        int n2 = body.get("n2");
        return n1 * n2;
    }    
    
}
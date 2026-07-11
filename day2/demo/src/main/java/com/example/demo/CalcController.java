package com.example.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    // https://jsonplaceholder.typicode.com/posts
    // https://fakestoreapi.com/products
    

    //POST http://localhost:9090/add 
    //body: {"num1":10,"num2":20}
    
    @PostMapping("/add")
    public int add(@RequestBody Map<String,Integer> body) {
        int num1=body.get("num1");
        int num2=body.get("num2");
        return num1 + num2;
    }







    //http://localhost:9090/sqr/5
    @GetMapping("/sqr/{num1}")
    public int sqr(@PathVariable int num1) {
        return num1 * num1;
    }


    //to access this api http://localhost:9090/hi
    @GetMapping("/hi")
    public String kuchbhi() {
        return "Hello World";
    }


}

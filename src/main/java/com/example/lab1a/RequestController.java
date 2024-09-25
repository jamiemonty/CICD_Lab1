package com.example.lab1a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @GetMapping("/hello")
    public String message()
    {
        return "Hello";
    }
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello there " + name;
    }
    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age)
    {
        return name + " " + age;
    }
}
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

    @GetMapping("calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation)
    {
        float sum = 0;
        switch (operation){
            case "add":
                sum = num1 + num2;
                break;

            case "subtract":
                sum = num1 - num2;
                break;

            case "multiply":
                sum = num1 * num2;
                break;

            case "divide":
                if(num2 == 0){
                    return "You cannot divide by 0";
                }
                else {
                    sum = num1 / num2;

                }
                break;

            default:
                break;
        }

        return Float.toString(sum);

    }
}
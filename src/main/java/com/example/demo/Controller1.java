package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1{
    @GetMapping("/")
    public String hello(){
        return "<h1>Hello World</h1>";
    }
    @GetMapping("/test")
    public String test(){
        return "<h1>Hello Batman</h1>";
    }
}

package com.good.days.goodmen;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {

    @GetMapping("/")
     public String hello(){
        return "Hello world From Spring Boot";
     }
}

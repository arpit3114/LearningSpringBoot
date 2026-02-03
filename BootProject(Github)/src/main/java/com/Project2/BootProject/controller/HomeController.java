package com.Project2.BootProject.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to The Java World";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is from about";
    }

}

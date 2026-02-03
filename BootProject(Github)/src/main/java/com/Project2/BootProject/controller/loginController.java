package com.Project2.BootProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {


    @RequestMapping("/login")
    public String login(){
        return "this is from Login";
    }
}

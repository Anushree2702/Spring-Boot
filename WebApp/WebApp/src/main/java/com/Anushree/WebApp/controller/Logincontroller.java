package com.Anushree.WebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Logincontroller {
    @RequestMapping("/login")
    public String login()
    {
        return "you are logged in";
    }
    
}

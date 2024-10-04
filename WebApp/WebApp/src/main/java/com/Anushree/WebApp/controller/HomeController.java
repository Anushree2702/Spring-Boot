package com.Anushree.WebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    
    public String greet()
    {
        
        return "welcome to website";
    }
    @RequestMapping("/about")
    public String about()
    {
        return "my name is anu";
    }
}

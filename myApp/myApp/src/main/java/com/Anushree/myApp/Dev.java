package com.Anushree.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component

public class Dev {
    @Qualifier("desktop")


    @Autowired                     //field injection
    private computer comp;



   // public Dev(Laptop laptop)      //constructor injection
   // {
   //     this.laptop=laptop;
   // }

   
  // @Autowired                      //setter injection       
  // public void setLaptop(computer laptop)
  // {
  //  this.laptop=laptop;
  // }


    public void build()
    {
        comp.compile();
        System.out.println("working on awesome project");
    }
    
}

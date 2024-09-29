package com.Anushree.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


   

@Component

public class Desktop implements computer {
    
    public void compile()
    {
        System.out.println("hello world , how are you?, doing well?");
    }
    
}

    


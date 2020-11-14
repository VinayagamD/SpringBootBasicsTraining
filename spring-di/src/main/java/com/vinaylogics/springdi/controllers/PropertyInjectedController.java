package com.vinaylogics.springdi.controllers;

import com.vinaylogics.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyGreetingService")
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

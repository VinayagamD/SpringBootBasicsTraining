package com.vinaylogics.springdi.services.impl;

import com.vinaylogics.springdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}


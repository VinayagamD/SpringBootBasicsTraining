package com.vinaylogics.springdi.services.impl;

import com.vinaylogics.springdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}

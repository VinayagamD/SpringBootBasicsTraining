package com.vinaylogics.sfgpetclinic.controllers;

import com.vinaylogics.sfgpetclinic.services.MyService;

public class SomeController {

    private final MyService myService;

    public SomeController(MyService myService) {
        this.myService = myService;
    }


}

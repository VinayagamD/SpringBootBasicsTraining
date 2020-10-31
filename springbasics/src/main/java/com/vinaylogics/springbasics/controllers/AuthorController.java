package com.vinaylogics.springbasics.controllers;

import com.vinaylogics.springbasics.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorController {

    private final AuthorRepository repository;

    public AuthorController(AuthorRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/authors")
    public String authors(Model model){
        model.addAttribute("authors", repository.findAll());
        return "authors/list";
    }

}

package com.vinaylogics.springbasics.controllers;

import com.vinaylogics.springbasics.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", repository.findAll());
        return "list";
    }
}

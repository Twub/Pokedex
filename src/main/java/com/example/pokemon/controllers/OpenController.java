package com.example.pokemon.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenController {

    @GetMapping("/open")
    public String open(){
        return "This endpoint is open!";
    }
}

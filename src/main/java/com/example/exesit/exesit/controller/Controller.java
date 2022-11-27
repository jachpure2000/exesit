package com.example.exesit.exesit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/data")
public class Controller {

    @GetMapping("/message")
    public String getMessage(){
        return "aman bhosdi wala";
    }
}

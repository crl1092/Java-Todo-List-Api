package com.example.todoapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healt")
public class HealthController {

    @GetMapping
    public String Health() {
        return "Ok";
    }
}

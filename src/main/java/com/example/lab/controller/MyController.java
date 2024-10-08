package com.example.lab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class MyController {

    @GetMapping("test")
    public String getGreatings() {
        return "Test";
    }
}

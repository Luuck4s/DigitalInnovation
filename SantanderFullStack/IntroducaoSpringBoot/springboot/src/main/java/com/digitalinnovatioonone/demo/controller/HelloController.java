package com.digitalinnovatioonone.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String heeloMessage() {
        return "Hello, Digital Innovation one!";
    }
}

package com.dragontalker.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/bug.jpg")
    public String hello() {
        return "aaaa";
    }
}

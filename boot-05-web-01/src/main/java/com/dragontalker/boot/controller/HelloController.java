package com.dragontalker.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/bug")
    public String hello() {
        return "aaaa";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser() {
       return "GET-张三";
    }
}

package com.dragontalker.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class HelloController {
    
    @RequestMapping("/hello")
    public String handle01() {
        return "Hello, Spring Boot 2!";
    }
}

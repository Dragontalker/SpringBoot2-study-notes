package com.dragontalker.boot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/bug")
    public String hello() {
        return "aaaa";
    }

    @GetMapping("/user")
    public String getUser() {
       return "GET-张三";
    }

    @PostMapping("/user")
    public String postUser() {
        return "POST-张三";
    }

    @PutMapping("/user")
    public String putUser() {
        return "PUT-张三";
    }

    @DeleteMapping("/user")
    public String deleteUser() {
        return "DELETE-张三";
    }

    // 扩展点: 如果使用自定义方法名
}

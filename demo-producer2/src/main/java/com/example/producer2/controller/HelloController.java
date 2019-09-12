package com.example.producer2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sunshuo
 * @Date: 2019/9/10/010 18:38
 * @Version: 1.0
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(String name) {
        return "hello "+name+"，this is second message";
    }
}

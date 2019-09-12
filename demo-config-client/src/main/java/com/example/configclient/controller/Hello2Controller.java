package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sunshuo
 * @Date: 2019/9/11/011 16:43
 * @Version: 1.0
 */
@RestController
public class Hello2Controller {

    @Value("${neo.hello}")
    private String hello;

    @GetMapping("hello2")
    public String from() {
        return hello;
    }
}

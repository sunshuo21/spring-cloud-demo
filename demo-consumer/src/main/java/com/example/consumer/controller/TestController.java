package com.example.consumer.controller;

import com.example.consumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sunshuo
 * @Date: 2019/9/10/010 18:48
 * @Version: 1.0
 */
@RestController
public class TestController {

    @Autowired
    private HelloRemote helloRemote;

    @GetMapping("test/{name}")
    public String test(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
}

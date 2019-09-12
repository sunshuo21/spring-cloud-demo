package com.example.consumer.remote;

import org.springframework.stereotype.Component;

/**
 * @Author: sunshuo
 * @Date: 2019/9/11/011 12:22
 * @Version: 1.0
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(String name) {
        return "hello " + name + ", this message send failed";
    }
}

package com.example.consumer2.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: sunshuo
 * @Date: 2019/9/10/010 18:46
 * @Version: 1.0
 */
@FeignClient(name = "demo-producer2", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @GetMapping("hello")
    String hello2(@RequestParam(value = "name") String name);
}

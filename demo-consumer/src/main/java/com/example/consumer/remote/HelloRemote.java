package com.example.consumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: sunshuo
 * @Date: 2019/9/10/010 18:46
 * @Version: 1.0
 */
@FeignClient(name = "demo-provider", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @GetMapping("hello")
    String hello(@RequestParam(value = "name") String name);
}

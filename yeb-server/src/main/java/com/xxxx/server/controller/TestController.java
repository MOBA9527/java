package com.xxxx.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试Contrller
 */
@RestController
public class TestController {
    @GetMapping("test")
    public String test(){
        return "test";
    }

    @GetMapping("/employee/basic")
    public String test1(){
        return "/employee/basic";
    }

    @GetMapping("/employee/advanced")
    public String test2(){
        return "/employee/advanced";
    }
}

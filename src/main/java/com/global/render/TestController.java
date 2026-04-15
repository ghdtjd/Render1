package com.global.render;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "server is running";
    }

    @GetMapping("/hi")
    public String hello() {
        return "hi world";
    }
}

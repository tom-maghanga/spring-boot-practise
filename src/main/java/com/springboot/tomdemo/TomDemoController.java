package com.springboot.tomdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomDemoController {

    @GetMapping("/hello-world")
    public String hello_world(){
        return "This is my first Spring Project";
    }
}

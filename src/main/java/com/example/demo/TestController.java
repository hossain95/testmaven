package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/info")
    public Info getInfo(){
        Info info = new Info();
        info.setName("Mia Hossain");
        info.setEmail("miahossain@gmail.com");
        return info;
    }
    @PostMapping("/info")
    public Info postInfo(){
        Info info = new Info();
        info.setName("Mia Hossain");
        info.setEmail("miahossain@gmail.com");
        return info;
    }
}

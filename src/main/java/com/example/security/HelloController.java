package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/public")
    public String publicEndPoint(){
        System.out.println("public");
        return "This is public EndPoint";
    }

    @GetMapping("/secure")
    public String secureEndPoint(){
        System.out.println("Secure");
        return "This is Secure EndPoint";
    }
}

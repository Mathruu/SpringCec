package com.example.springcec.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/auth")
public class AuthResource {
    
    @GetMapping(value = "/")
    public Boolean auth() {
        return true;
    }
}

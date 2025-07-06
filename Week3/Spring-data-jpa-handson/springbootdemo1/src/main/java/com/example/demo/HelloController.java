package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")  // root mapping for home page
    @ResponseBody
    public String greet() {
        return "Hello from HelloController!";
    }
}

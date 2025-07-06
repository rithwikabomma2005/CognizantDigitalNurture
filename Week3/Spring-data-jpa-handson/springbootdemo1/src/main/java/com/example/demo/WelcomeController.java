package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")  // changed from "/" to "/welcome"
    public String showWelcomePage(Model model) {
        model.addAttribute("message", "Welcome to the Spring Boot Webpage!");
        return "welcome";  // Thymeleaf template name: welcome.html
    }
}

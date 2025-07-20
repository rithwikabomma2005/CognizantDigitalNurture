package com.micro.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/account/details")
    public String getAccount() {
        return "Account details from Account Service";
    }
}

package com.micro.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @GetMapping("/loan/details")
    public String getLoan() {
        return "Loan details from Loan Service";
    }
}

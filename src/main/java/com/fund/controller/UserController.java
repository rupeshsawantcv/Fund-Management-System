package com.fund.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fund.entity.Loan;
import com.fund.service.LoanService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private LoanService loanService;

    // User can view own loans
    @GetMapping("/{userId}/loans")
    public Loan getUserLoans(@PathVariable Long userId) {
        return loanService.getLoanById(userId);
    }
}

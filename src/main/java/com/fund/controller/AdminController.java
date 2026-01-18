package com.fund.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.fund.entity.*;
import com.fund.service.*;
import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private LoanService loanService;

    @Autowired
    

    // Create User - Use POST in Postman
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // Get All Users - Now supports GET requests (Browser/Postman)
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Create Loan
    @PostMapping("/loans")
    public Loan createLoan(@RequestBody Loan loan) {
        return loanService.createLoan(loan);
    }
}
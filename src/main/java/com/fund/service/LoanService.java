package com.fund.service;

import java.math.BigDecimal;
import java.util.List;

import com.fund.entity.Loan;
import com.fund.entity.User;

public interface LoanService {
    Loan createLoan(Loan loan);
    Loan getLoanById(Long id);
    List<Loan> getAllLoans();
    List<Loan> getLoansByUser(User user);
    Loan updateRemainingAmount(Long loanId, BigDecimal newAmount);
}

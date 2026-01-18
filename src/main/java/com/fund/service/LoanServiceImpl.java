package com.fund.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fund.entity.Loan;
import com.fund.entity.User;
import com.fund.repository.LoanRepository;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanRepository loanRepository;

    @Override
    public Loan createLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    @Override
    public Loan getLoanById(Long id) {
        return loanRepository.findById(id).orElse(null);
    }

    @Override
    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    @Override
    public List<Loan> getLoansByUser(User user) {
        return loanRepository.findByUser(user);
    }

    @Override
    
    public Loan updateRemainingAmount(Long loanId, BigDecimal newAmount) {
        Loan loan = loanRepository.findById(loanId).orElse(null);
        if (loan != null) {  // null check correct आहे
            // Convert Double to BigDecimal for financial safety
            loan.setRemainingAmount(newAmount);
            return loanRepository.save(loan);
        }
        return null;
    }
}

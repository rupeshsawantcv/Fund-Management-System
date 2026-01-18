package com.fund.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fund.entity.Loan;
import com.fund.entity.LoanPayment;
import com.fund.repository.LoanPaymentRepository;

@Service
public class LoanPaymentServiceImpl implements LoanPaymentService {

    @Autowired
    private LoanPaymentRepository loanPaymentRepository;

    @Override
    public LoanPayment addPayment(LoanPayment payment) {
        return loanPaymentRepository.save(payment);
    }

    @Override
    public List<LoanPayment> getPaymentsByLoan(Loan loan) {
        return loanPaymentRepository.findByLoan(loan);
    }
}

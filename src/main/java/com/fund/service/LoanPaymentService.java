package com.fund.service;

import java.util.List;

import com.fund.entity.Loan;
import com.fund.entity.LoanPayment;

public interface LoanPaymentService {
    LoanPayment addPayment(LoanPayment payment);
    List<LoanPayment> getPaymentsByLoan(Loan loan);
}

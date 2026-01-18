package com.fund.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "loan_payments")
@Getter
@Setter
public class LoanPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long paymentId;

    // Many payments for one loan
    @ManyToOne
    @JoinColumn(name = "loan_id", nullable = false)
    private Loan loan;

    @Column(name = "payment_month", nullable = false, length = 20)
    private String paymentMonth;

    @Column(name = "paid_amount", nullable = false)
    private BigDecimal paidAmount;

    @Column(name = "remaining_balance", nullable = false)
    private BigDecimal remainingBalance;

    @Column(name = "payment_date")
    private LocalDateTime paymentDate = LocalDateTime.now();
}

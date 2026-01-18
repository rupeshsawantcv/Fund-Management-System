package com.fund.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "loans")
@Getter
@Setter
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id")
    private Long loanId;

    // Many loans can belong to one user
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Many loans can be from one fund
    @ManyToOne
    @JoinColumn(name = "fund_id", nullable = false)
    private Fund fund;

    @Column(name = "loan_amount", nullable = false)
    private BigDecimal loanAmount;

    // Nullable as discussed
    @Column(name = "interest_rate")
    private BigDecimal interestRate;

    // Nullable as discussed
    @Column(name = "duration_months")
    private Integer durationMonths;

    @Column(name = "remaining_amount", nullable = false)
    private BigDecimal remainingAmount;

    @Enumerated(EnumType.STRING)
    private LoanStatus status = LoanStatus.ACTIVE;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

	public void setRemainingAmount(BigDecimal remainingAmount) {
		
		this.remainingAmount=remainingAmount;
		// TODO Auto-generated method stub
		
	}

    // Explicit setter for remainingAmount (fix Lombok sync issue)
   
}

package com.fund.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "funds")
@Getter
@Setter
public class Fund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fund_id")
    private Long fundId;

    @Column(name = "fund_name", nullable = false, length = 100)
    private String fundName;

    @Column(name = "total_amount", nullable = false)
    private Double totalAmount;

    @Column(name = "available_amount", nullable = false)
    private Double availableAmount;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
}

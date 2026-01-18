package com.fund.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fund.entity.Fund;

@Repository
public interface FundRepository extends JpaRepository<Fund, Long> {
    Fund findByFundName(String fundName);
}

package com.fund.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fund.entity.Fund;
import com.fund.repository.FundRepository;

@Service
public class FundServiceImpl implements FundService {

    @Autowired
    private FundRepository fundRepository;

    @Override
    public Fund createFund(Fund fund) {
        return fundRepository.save(fund);
    }

    @Override
    public Fund getFundById(Long id) {
        return fundRepository.findById(id).orElse(null);
    }

    @Override
    public List<Fund> getAllFunds() {
        return fundRepository.findAll();
    }

    @Override
    public Fund getFundByName(String name) {
        return fundRepository.findByFundName(name);
    }
}

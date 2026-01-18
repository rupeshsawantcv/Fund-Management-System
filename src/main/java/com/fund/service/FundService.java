package com.fund.service;

import java.util.List;
import com.fund.entity.Fund;

public interface FundService {
    Fund createFund(Fund fund);
    Fund getFundById(Long id);
    List<Fund> getAllFunds();
    Fund getFundByName(String name);
}

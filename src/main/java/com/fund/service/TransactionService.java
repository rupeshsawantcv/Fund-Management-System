package com.fund.service;

import java.util.List;

import com.fund.entity.Fund;
import com.fund.entity.Transaction;

public interface TransactionService {
    Transaction addTransaction(Transaction transaction);
    List<Transaction> getTransactionsByFund(Fund fund);
}

package com.elifcro.interviews.service;

import com.elifcro.interviews.mapper.RequestMapper;
import com.elifcro.interviews.model.TransactionRecord;
import com.elifcro.interviews.repository.Transaction;
import com.elifcro.interviews.repository.TransactionRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransactionService {

    private final TransactionRepository transactionRepository;

    private final RequestMapper requestMapper;

    public TransactionService(TransactionRepository transactionRepository, RequestMapper requestMapper) {
        this.transactionRepository = transactionRepository;
        this.requestMapper = requestMapper;
    }

    public List<TransactionRecord> fetchTransaction() {
        List<Transaction> transactions = transactionRepository.findAll();
        return requestMapper.mapRequest(transactions);
    }

}

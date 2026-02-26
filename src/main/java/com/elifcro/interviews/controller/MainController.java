package com.elifcro.interviews.controller;

import com.elifcro.interviews.service.TransactionService;
import com.elifcro.interviews.model.TransactionRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private TransactionService transactionService;


    @GetMapping("/transactions")
    public List<TransactionRecord> transactions() {
        return transactionService.fetchTransaction();
    }
}

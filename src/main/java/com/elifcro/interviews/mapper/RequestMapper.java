package com.elifcro.interviews.mapper;


import com.elifcro.interviews.helper.DBHelper;
import com.elifcro.interviews.model.TransactionRecord;
import com.elifcro.interviews.repository.Transaction;
import com.elifcro.interviews.service.TransactionService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class RequestMapper {

    private final DBHelper dbHelper;

    public RequestMapper(DBHelper dbHelper) {
        this.dbHelper = dbHelper;
    }

    public List<TransactionRecord> mapRequest(List<Transaction> transactions) {
        //dbHelper.printRecord();
        return transactions.stream().filter(Objects::nonNull).map(t -> {
            return new TransactionRecord(t.getId(), new BigDecimal(String.valueOf(t.getAmount())));
        }).collect(Collectors.toList());
    }
}

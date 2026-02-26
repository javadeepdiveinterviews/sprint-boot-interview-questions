package com.elifcro.interviews.repository;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "transaction")
@Setter
@Getter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL-friendly
    private Integer id;

    private BigDecimal amount;

    private String createdBy;
}

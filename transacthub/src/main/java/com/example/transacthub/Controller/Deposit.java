package com.example.transacthub.Controller;

public class Deposit {
    private Long id;
    private TransactionType type;
    private String transactionDate;
    private TransactionStatus status;
    private Long payeeId;
    private DepositMedium medium;
    private Double amount;
    private String description;

    public Deposit() {
    }

    public Deposit(Long id, TransactionType type, String transactionDate, TransactionStatus status,
                   Long payeeId, DepositMedium medium, Double amount, String description) {
        this.id = id;
        this.type = type;
        this.transactionDate = transactionDate;
        this.status = status;
        this.payeeId = payeeId;
        this.m

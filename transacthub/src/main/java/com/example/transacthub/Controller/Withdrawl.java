package com.example.transacthub.Controller;

public class Withdrawal {
    private Long id;
    private TransactionType type;
    private String transactionDate;
    private TransactionStatus status;
    private Long payerId;
    private WithdrawalMedium medium;
    private Double amount;
    private String description;

    public Withdrawal() {
    }

    public Withdrawal(Long id, TransactionType type, String transactionDate, TransactionStatus status,
                      Long payerId, WithdrawalMedium medium, Double amount, String description) {
        this.id = id;
        this.type = type;
        this.transactionDate = transactionDate;
        this.status = status;
        this.payerId = payerId;
        this.medium = medium;
        this.amount = amount;
        this.description = description;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public Long getPayerId() {
        return payerId;
    }

    public void setPayerId(Long payerId) {
        this.payerId = payerId;
    }

    public WithdrawalMedium getMedium() {
        return medium;
    }

    public void setMedium(WithdrawalMedium medium) {
        this.medium = medium;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package com.example.transacthub.Model;

package com.example.transacthub.model;

public class Withdrawal {
    private Long id;
    private String type;
    private String transactionDate;
    private String status;
    private Long payerId;
    private WithdrawalMedium medium;
    private Double amount;
    private String description;

    public Withdrawal() {
        // Default constructor
    }

    public Withdrawal(Long id, String type, String transactionDate, String status, Long payerId,
                      WithdrawalMedium medium, Double amount, String description) {
        this.id = id;
        this.type = type;
        this.transactionDate = transactionDate;
        this.status = status;
        this.payerId = payerId;
        this.medium = medium;
        this.amount = amount;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

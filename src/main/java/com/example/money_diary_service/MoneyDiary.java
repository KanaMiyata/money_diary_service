package com.example.money_diary_service;

import java.time.LocalDate;

public class MoneyDiary {
    private int id;
    private LocalDate dateAdded;
    private String transactionType;
    private String itemName;
    private double amount;
    private String comment;

    public int getId() {
        return id;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getItemName() {
        return itemName;
    }

    public double getAmount() {
        return amount;
    }

    public String getComment() {
        return comment;
    }

    public MoneyDiary(int id, LocalDate dateAdded, String transactionType, String itemName, double amount, String comment) {
        this.id = id;
        this.dateAdded = dateAdded;
        this.transactionType = transactionType;
        this.itemName = itemName;
        this.amount = amount;
        this.comment = comment;
    }
}

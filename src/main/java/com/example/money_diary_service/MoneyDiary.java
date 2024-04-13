package com.example.money_diary_service;

import java.time.LocalDate;

public class MoneyDiary {
    private int id;
    private LocalDate dateAdded;
    private String income;
    private String expense;
    private int amount;
    private String comment;

    public int getId() {
        return id;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public String getIncome() {
        return income;
    }
    public String getExpense() {
        return expense;
    }
    public int getAmount(){ return amount;}

    public String getComment() {
        return comment;
    }

    public MoneyDiary(int id, LocalDate dateAdded, String income, String expense, int amount, String comment) {
        this.id = id;
        this.dateAdded = dateAdded;
        this.income = income;
        this.expense=expense;
        this.amount=amount;
        this.comment = comment;
    }
}

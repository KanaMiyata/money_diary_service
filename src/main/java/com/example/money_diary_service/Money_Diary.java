package com.example.money_diary_service;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Money_Diary {
    private int id;
    private LocalDate day;
    private String income;
    private String expense;
    private int amount;
    private String comment;

    public int getId() {
        return id;
    }

    public LocalDate getDay() {
        return day;
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

    public Money_Diary(int id, LocalDate day, String income, String expense,int amount,String comment) {
        this.id = id;
        this.day = day;
        this.income = income;
        this.expense=expense;
        this.amount=amount;
        this.comment = comment;
    }
}


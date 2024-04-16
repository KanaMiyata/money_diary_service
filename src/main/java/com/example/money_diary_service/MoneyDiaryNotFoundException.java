package com.example.money_diary_service;

public class MoneyDiaryNotFoundException extends RuntimeException {
    public MoneyDiaryNotFoundException(String message) {
        super(message);
    }
}

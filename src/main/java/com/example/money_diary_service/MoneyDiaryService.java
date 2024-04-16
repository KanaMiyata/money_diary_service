package com.example.money_diary_service;

import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class MoneyDiaryService {
    private final MoneyDiaryMapper moneyDiaryMapper;

    public MoneyDiaryService(MoneyDiaryMapper moneyDiaryMapper) {
        this.moneyDiaryMapper = moneyDiaryMapper;
    }

    public MoneyDiary findMoneyDiary(int id) {
        Optional<MoneyDiary> moneyDiary = this.moneyDiaryMapper.findById(id);
        if (moneyDiary.isPresent()) {
            return moneyDiary.get();
        } else {
            throw new MoneyDiaryNotFoundException("not found");
        }
    }
}

package com.example.money_diary_service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class MoneyDiaryService {
    private final MoneyDiaryMapper moneyDiaryMapper;

    public MoneyDiaryService(MoneyDiaryMapper moneyDiaryMapper) {
        this.moneyDiaryMapper = moneyDiaryMapper;
    }

    public MoneyDiary findRecordById(int id) {
        Optional<MoneyDiary> moneyDiary = moneyDiaryMapper.findById(id);
        if (moneyDiary.isPresent()) {
            return moneyDiary.get();
        } else {
            throw new MoneyDiaryNotFoundException("Record by id not found");
        }
    }

    public List<MoneyDiary> findByDatesAndTransactionType(LocalDate startDate, LocalDate endDate, String transactionType) {
        List<MoneyDiary> moneyDiary = moneyDiaryMapper.findByDatesAndTransactionType(startDate, endDate, transactionType);
        return moneyDiary;
    }
}



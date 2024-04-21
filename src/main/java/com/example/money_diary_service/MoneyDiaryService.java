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
    public List<MoneyDiary> findRecordBy(LocalDate startDate, LocalDate endDate, String type) {
        List<MoneyDiary> moneyDiary = moneyDiaryMapper.findAll();
        if (type != null) {
            moneyDiary = moneyDiaryMapper.findByTransactionType(type);
        }
        if (!moneyDiary.isEmpty()) {
            return moneyDiary;
        } else {
            throw new MoneyDiaryNotFoundException("Records by transaction type not found");

            public List<MoneyDiary> findRecordBy LocalDate;
            (LocalDate startDate, LocalDate endDate) {
                List<MoneyDiary> moneyDiary = moneyDiaryMapper.findAll();
                if (startDate != null && endDate != null) {
                    moneyDiary = moneyDiaryMapper.findByDates(startDate, endDate);
                }
                if (!moneyDiary.isEmpty()) {
                    return moneyDiary;
                } else {
                    throw new MoneyDiaryNotFoundException("Records not found");
                }


        }
    }

}
    }


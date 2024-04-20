package com.example.money_diary_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class MoneyDiaryController {
    private MoneyDiaryService moneyDiaryService;

    public MoneyDiaryController(MoneyDiaryService moneyDiaryService) {
        this.moneyDiaryService = moneyDiaryService;
    }

    @GetMapping("/money_diaries/{id}")
    public Optional<MoneyDiary> findById(@PathVariable int id) {
        return Optional.ofNullable(moneyDiaryService.findRecordById(id));
    }

    @GetMapping("/money_diaries/transaction_type/{type}")
    public List<MoneyDiary> findByTransactionType(@PathVariable String type) {
        return moneyDiaryService.findRecordByTransactionType(type);
    }

    @GetMapping("/money_diaries")
    public List<MoneyDiary> findRecords(@RequestParam(required = false) LocalDate startDate,
                                        @RequestParam(required = false) LocalDate endDate) {
        return moneyDiaryService.findRecordBy(startDate, endDate);
    }
}

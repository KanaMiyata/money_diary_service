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

    @GetMapping("/money_diaries")
    public List<MoneyDiary> findByDates_and_transactionType(@RequestParam LocalDate startDate,
                                                            @RequestParam LocalDate endDate,
                                                            @RequestParam String transactionType) {
        return moneyDiaryService.findByDates_and_transactionType(startDate, endDate, transactionType);
    }
}

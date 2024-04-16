package com.example.money_diary_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class MoneyController {
    private MoneyDiaryMapper moneyDiaryMapper;

    public MoneyController(MoneyDiaryMapper moneyDiaryMapper) {
        this.moneyDiaryMapper = moneyDiaryMapper;
    }

    public MoneyDiaryMapper getMoneyDiaryMapper() {
        return moneyDiaryMapper;
    }

    public void setMoneyDiaryMapper(MoneyDiaryMapper moneyDiaryMapper) {
        this.moneyDiaryMapper = moneyDiaryMapper;
    }

    //@GetMapping("/money_diaries")
    //List<MoneyDiary> getMoneyDiaries() {
    //    return moneyDiaryMapper.findAll();
    // }

    @GetMapping("/money_diaries/{id}")
    public Optional<MoneyDiary> findById(@PathVariable int id) {
        return moneyDiaryMapper.findById(id);
    }

    @GetMapping("/money_diaries")
    public List<MoneyDiary> findByTransactionType(@RequestParam String transactionType) {
        return moneyDiaryMapper.findByTransactionType(transactionType);
    }

    @GetMapping("/money_diaries/dates")
    public List<MoneyDiary> findByDates(@RequestParam LocalDate startDate, @RequestParam LocalDate endDate) {
        return moneyDiaryMapper.findByDates(startDate, endDate);
    }
}

package com.example.money_diary_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoneyController {
    private MoneyDiaryMapper moneyDiaryMapper;

    public MoneyController(MoneyDiaryMapper moneyDiaryMapper) {
        this.moneyDiaryMapper = moneyDiaryMapper;
    }

    @GetMapping("/money_diaries")
    List<MoneyDiary> getMoneyDiaries() {
        return moneyDiaryMapper.findAll();
    }
}

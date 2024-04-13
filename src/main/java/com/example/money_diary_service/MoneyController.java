package com.example.money_diary_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoneyController {

    public MoneyController(MoneyDiaryMapper moneyDiaryMapper) {
        this. moneyDiaryMapper = moneyDiaryMapper;
    }

    private MoneyDiaryMapper moneyDiaryMapper ;

    @GetMapping("/money_diarys")
    List<Money_Diary> getMoney_diarys() {
        List<Money_Diary> money_diarys = moneyDiaryMapper.findAll();
        return money_diarys;
    }
}

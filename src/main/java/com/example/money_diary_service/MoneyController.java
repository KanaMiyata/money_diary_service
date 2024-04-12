package com.example.money_diary_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoneyController {

    public MoneyController(Money_Diary_Mapper money_diary_Mapper) {
        this.money_diary_mapper = money_diary_Mapper;
    }

    private Money_Diary_Mapper money_diary_mapper;

    @GetMapping("/money_diarys")
    List<Money_Diary> getMoney_diarys() {
        List<Money_Diary> money_diarys = money_diary_mapper.findAll();
        return money_diarys;
    }
}

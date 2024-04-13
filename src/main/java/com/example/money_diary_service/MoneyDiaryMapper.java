package com.example.money_diary_service;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MoneyDiaryMapper {
    @Select("SELECT * FROM money_diaries")
    List<MoneyDiary> findAll();
}

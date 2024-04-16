package com.example.money_diary_service;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Mapper
public interface MoneyDiaryMapper {

   // @Select("SELECT * FROM money_diaries")
    //List<MoneyDiary> findAll();

    @Select("SELECT * FROM money_diaries WHERE LIKE CONCAT(# {id})")
    List<MoneyDiary> findByMoneyDiary(int id);

    @Select("SELECT * FROM money_diaries WHERE id =#{id}")
    Optional<MoneyDiary> findById(int id);

    @Select("SELECT * FROM money_diaries WHERE TRANSACTION_TYPE =#{transactionType}")
    List<MoneyDiary> findByTransactionType(String transactionType);

    @Select("SELECT * FROM money_diaries WHERE DATE_ADDED BETWEEN #{startDate} AND #{endDate}")
    List<MoneyDiary> findByDates(LocalDate startDate, LocalDate endDate);
}

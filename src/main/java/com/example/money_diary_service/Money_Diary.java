package com.example.money_diary_service;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Money_Diary {
    private int id;
    private LocalDate 日;
    private String 収入;
    private String 出費;
    private int 金額;
    private String コメント;

    public int getId() {
        return id;
    }

    public LocalDate get日() {
        return 日;
    }

    public String get収入() {
        return 収入;
    }
    public String get出費() {
        return 出費;
    }
    public int get金額(){ return 金額;}

    public String getコメント() {
        return コメント;
    }

    public Money_Diary(int id, LocalDate 日, String 収入, String 出費,int 金額,String コメント) {
        this.id = id;
        this.日 = 日;
        this.収入 = 収入;
        this.出費=出費;
        this.金額=金額;
        this.コメント = コメント;


    }
}


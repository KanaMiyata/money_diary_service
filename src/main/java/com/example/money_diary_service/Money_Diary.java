package com.example.money_diary_service;

import java.util.Date;

public class Money_Diary {
    private int id;
    private Date usingday;
    private String category;

    private String comment;

    public int getId() {
        return id;
    }

    public Date getUsingday() {
        return usingday;
    }

    public String getCategory() {
        return category;
    }

    public String getComment() {
        return comment;
    }

    public Money_Diary(int id, Date usingday, String category, String comment) {
        this.id = id;
        this.usingday = usingday;
        this.category = category;
        this.comment = comment;


    }
}



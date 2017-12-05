package com.progettoscamorza.thewallofeverything.persistence.entity;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "ANSWERS")
public class Answer {

    @PrimaryKey
    private Integer id;

    @ColumnInfo(name = "QUESTION_TEXT")
    private String text;
    @ColumnInfo(name = "DELETABLE")
    private boolean isDeletable;

    public Answer(String text, boolean isDeletable) {
        this.text = text;
        this.isDeletable = isDeletable;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDeletable() {
        return isDeletable;
    }

    public void setDeletable(boolean deletable) {
        isDeletable = deletable;
    }
}
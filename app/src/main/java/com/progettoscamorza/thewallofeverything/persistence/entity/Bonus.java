package com.progettoscamorza.thewallofeverything.persistence.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "BONUSES")
public abstract class Bonus {

    @PrimaryKey
    private Integer id;

    @ColumnInfo(name = "PRICE")
    private Integer price;

    public Bonus() {
    }

    public Bonus(Integer price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
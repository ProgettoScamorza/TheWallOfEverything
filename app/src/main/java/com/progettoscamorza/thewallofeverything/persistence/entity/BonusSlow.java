package com.progettoscamorza.thewallofeverything.persistence.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;

@Entity(tableName = "BONUSES")
public class BonusSlow extends Bonus {

    @Ignore
    private final static Integer price = 20;

    public BonusSlow() {
        super(price);
    }
}

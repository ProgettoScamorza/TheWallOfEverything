package com.progettoscamorza.thewallofeverything.persistence.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;

@Entity(tableName = "BONUSES")
public class BonusFiftyFifty extends Bonus {

    @Ignore
    private final static Integer price = 30;

    public BonusFiftyFifty() {
        super(price);
    }
}


package com.progettoscamorza.thewallofeverything.userprofile;

//@Entity(tableName = "BONUSES")
public class BonusFiftyFifty extends Bonus {

    //@Ignore
    private final static Integer price = 30;

    public BonusFiftyFifty() {
        super(price);
    }
}


package com.progettoscamorza.thewallofeverything.userprofile;

//@Entity(tableName = "BONUSES")
public class BonusPause extends Bonus {

    //@Ignore
    private final static Integer price = 25;

    public BonusPause() {
        super(price);
    }
}

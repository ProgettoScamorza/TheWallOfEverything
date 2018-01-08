package com.progettoscamorza.thewallofeverything.userprofile;

//@Entity(tableName = "BONUSES")
public class BonusSlow extends Bonus {

    //@Ignore
    private final static Integer price = 20;

    public BonusSlow() {
        super(price);
    }
}

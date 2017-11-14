package com.progettoscamorza.thewallofeverything.userprofile;

public class Storage {

    private Integer coins;

    public Storage() {
    }

    public Storage(Integer coins) {
        this.coins = coins;
    }

    public void addCoins(Integer coins) {
        this.coins += coins;
    }

    public void removeCoins(Integer coins) {
        this.coins -= coins;
    }

    public Integer getCoins() {
        return coins;
    }

    public void setCoins(Integer coins) {
        this.coins = coins;
    }
}

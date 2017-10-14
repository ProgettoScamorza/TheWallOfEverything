package com.progettoscamorza.thewallofeverything.entity;

public class Wallet {

    private Integer coins;

    public Wallet() {
    }

    public Wallet(Integer coins) {
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

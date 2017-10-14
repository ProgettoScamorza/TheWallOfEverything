package com.progettoscamorza.thewallofeverything.entity;

public abstract class Bonus {

    private Integer price;

    public Bonus() {
    }

    public Bonus(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
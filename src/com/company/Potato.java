package com.company;

public class Potato extends Vegetables {
    private String taste;

    public Potato(String color, String name, String taste) {
        this.taste = taste;
        this.setName(name);
        this.color = color;
    }
}

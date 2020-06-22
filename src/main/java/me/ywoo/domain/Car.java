package me.ywoo.domain;

public class Car {
    private final String name;
    private int position = 0;

    public Car() {
        String name = CarName.getName();
        this.name = name;
    }

}
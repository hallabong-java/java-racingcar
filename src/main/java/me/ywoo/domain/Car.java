/*
 * Car.java            2.0      2020-07-06
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

/**
 * Car.class
 * Car 객체 생성
 *
 * @author 조연우
 * @version 2.0     2020년 7월 6일
 */

public class Car {
    private CarPosition carPosition;
    private CarName name;

    public Car(CarName carName, CarPosition carPosition) {
        this.name = carName;
        this.carPosition = carPosition;
    }

    public int getPosition() {
        return carPosition.getPosition();
    }

    public String getName() {
        return name.getCarName();
    }
}
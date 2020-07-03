/*
 * Car.java            1.12       2020-06-27
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
 * @version 1.2     2020년 6월 27일
 */

public class Car {

    private static final int MOVABLE_LOWER_BOUND = 4;

    private int position;
    private CarName name;

    public Car(CarName carName, int position) {
        this.name = carName;
        this.position = position;
    }

    public void movePosition(int number) {
        if (number >= MOVABLE_LOWER_BOUND) {
            this.position++;
        }
    }

    public boolean isSame(int winnerPosition) {
        return this.getPosition() == winnerPosition;
    }

    public int getPosition() {
        return position;
    }

    public CarName getName() {
        return name;
    }
}
/*
 * Car.java            1.0       2020-06-22
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
 * @version 1.0     2020년 6월 22일
 */

public class Car {
    private final String[] name;
    private int position = 0;

    public Car() {
        String[] name = CarName.getName();
        this.name = name;
    }

}
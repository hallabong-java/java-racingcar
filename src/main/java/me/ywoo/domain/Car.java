/*
 * Car.java            1.1       2020-06-26
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
 * @version 1.1     2020년 6월 26일
 */

public class Car {

    private static final int STANDARD_OF_START = 4;

    private int position;
    private String name;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public void movePosition(int number){
        if(number>=STANDARD_OF_START){
            this.position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
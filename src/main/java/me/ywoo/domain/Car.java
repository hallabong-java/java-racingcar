/*
 * Car.java            1.1       2020-06-26
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

import java.util.List;

/**
 * Car.class
 * Car 객체 생성
 *
 * @author 조연우
 * @version 1.1     2020년 6월 26일
 */

public class Car {

    private int position = 0;
    private List<String> name;

    public Car() {
        List<String> name = CarName.getName();
        this.name = name;
    }

}
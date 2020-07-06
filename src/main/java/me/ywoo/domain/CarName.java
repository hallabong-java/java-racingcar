/*
 * CarName.java            1.1       2020-07-03
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

/**
 * CarName.class
 * CarName 객체 생성
 *
 * @author 조연우
 * @version 1.1     2020년 7월 3일
 */

public class CarName {
    private static final int MAX_NAME_LENGTH = 5;

    public String carName;

    public CarName(String carName) {
        validateName(carName);
        this.carName = carName;
    }

    public void validateName(String carName) {
        if (carName.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("이름은 다섯글자 이내입니다.");
        }
    }

    public String getCarName() {
        return carName;
    }
}

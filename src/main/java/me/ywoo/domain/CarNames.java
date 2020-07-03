/*
 * CarNames.java            2.1       2020-07-03
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * CarNames.class
 * CarNames 객체 생성
 *
 * @author 조연우
 * @version 2.1     2020년 7월 3일
 */

public class CarNames {
    public static final int MAX_NAME_LENGTH = 5;
    private List<CarName> carNamesDivided = new ArrayList<CarName>();

    public CarNames(final String carNames) {
        splitString(carNames);
    }

    private void splitString(final String carNames) {
        String[] carNamesDivided = carNames.split(",");
        for (String name : carNamesDivided) {
            CarName carName = new CarName(name);
            this.carNamesDivided.add(carName);
        }
    }

    public List<CarName> getNameArray() {
        return carNamesDivided;
    }
}

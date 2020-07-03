/*
 * CarNames.java            2.0       2020-07-02
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
 * @version 2.0     2020년 7월 2일
 */

public class CarNames {
    public static final int MAX_NAME_LENGTH = 5;
    private List<CarName> carNamesDivided = new ArrayList<CarName>();

    public CarNames(final String carNames) {
        splitString(carNames);
        validate(carNamesDivided);
    }

    private void splitString(final String carNames) {
        String[] carNamesDivided = carNames.split(",");
        for (String name : carNamesDivided) {
            CarName carName = new CarName(name);
            this.carNamesDivided.add(carName);
        }
    }

    private void validate(final List<CarName> carNamesDivided) {
        for (CarName carName : carNamesDivided) {
            if (carName.getCarName().length() > MAX_NAME_LENGTH) {
                throw new IllegalArgumentException("이름은 다섯글자 이내입니다.");
            }
        }
    }

    public List<CarName> getNameArray() {
        return carNamesDivided;
    }
}

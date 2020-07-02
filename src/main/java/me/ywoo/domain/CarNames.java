/*
 * CarNames.java            2.0       2020-07-02
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

import java.util.ArrayList;
import java.util.Arrays;
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
    private List<CarName> arrayOfNames = new ArrayList<CarName>();

    public CarNames(final String nameString) {
        splitString(nameString);
        validate(arrayOfNames);
    }

    private void splitString(final String nameString) {
        String[] carNameSplit = nameString.split(",");
        for (String name : carNameSplit) {
            CarName carName = new CarName(name);
            arrayOfNames.add(carName);
        }
    }

    private void validate(final List<CarName> arrayOfNames) {
        for (CarName carName : arrayOfNames) {
            if (carName.getCarName().length() > MAX_NAME_LENGTH) {
                throw new IllegalArgumentException("이름은 다섯글자 이내입니다.");
            }
        }
    }

    public List<CarName> getNameArray() {
        return arrayOfNames;
    }
}

/*
 * CarName.java            1.0       2020-06-22
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

import java.util.List;
import java.util.Random;

import static java.util.stream.Collectors.toList;

/**
 * CarName.class
 * CarName 객체 생성
 *
 * @author 조연우
 * @version 1.0     2020년 6월 22일
 */

public class CarName {
    public static final int MAX_NAME_LENGTH = 5;
    private static String names;
    private static String[] nameString;
    List<Car> nameList;

    public CarName(final String names) {
        splitString(names);
        validate(nameString);
    }

    private void splitString(final String names){
        nameString = names.split(",");
    }

    private void validate(final String[] nameString) {
        for (String name : nameString) {
            if (name.length() > MAX_NAME_LENGTH) {
                throw new IllegalArgumentException("이름은 다섯글자 이내입니다.");
            }
        }
    }

    public static String[] getName() {
        return nameString;
    }
}

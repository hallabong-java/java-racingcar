/*
 * CarName.java            1.1       2020-06-26
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

import java.util.Arrays;
import java.util.List;

/**
 * CarName.class
 * CarName 객체 생성
 *
 * @author 조연우
 * @version 1.1     2020년 6월 26일
 */

public class CarName {
    public static final int MAX_NAME_LENGTH = 5;
    private static List<String> nameString;

    public CarName(final String names) {
        splitString(names);
        validate(nameString);
    }

    private void splitString(final String names) {
        List<String> nameString = Arrays.asList(names.split(","));
        this.nameString = nameString;
    }

    private void validate(final List<String> nameString) {
        for (String name : nameString) {
            if (name.length() > MAX_NAME_LENGTH) {
                throw new IllegalArgumentException("이름은 다섯글자 이내입니다.");
            }
        }
    }

    public static List<String> getName() {
        return nameString;
    }
}

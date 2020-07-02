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
    private List<String> arrayOfNames = new ArrayList<String>();

    public CarNames(final String names) {
        splitString(names);
        validate(arrayOfNames);
    }

    private void splitString(final String names) {
        arrayOfNames = Arrays.asList(names.split(","));
    }

    private void validate(final List<String> arrayOfNames) {
        for (String name : arrayOfNames) {
            if (name.length() > MAX_NAME_LENGTH) {
                throw new IllegalArgumentException("이름은 다섯글자 이내입니다.");
            }
        }
    }

    public List<String> getName() {
        return arrayOfNames;
    }
}

/*
 * CarNamesTest.java            1.3       2020-07-03
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * CarNamesTest.class
 * 차 이름 잘 받는지 테스트
 *
 * @author 조연우
 * @version 1.3     2020년 7월 3일
 */

class CarNamesTest {

    @DisplayName("Car() - 이름 받아서 객체 생성")
    @ParameterizedTest
    @ValueSource(strings = {"dusdy,hello"})
    void CarNames_GenerateInstance(final String name) {
        assertThat(new CarNames(name)).isInstanceOf(CarNames.class);
    }

    @DisplayName("splitName() - 문자열로 받아서 이름 잘 나누는지 검사")
    @ParameterizedTest
    @ValueSource(strings = {"test,hi,hello"})
    void CarNames_SplitName(final String names) {
        List<CarName> actual = new CarNames(names).getNameArray();
        List<CarName> expected = Arrays.asList(new CarName("test"), new CarName("hi"), new CarName("hello"));

        assertThat(actual.get(0).getCarName()).isEqualTo(expected.get(0).getCarName());
        assertThat(actual.get(1).getCarName()).isEqualTo(expected.get(1).getCarName());
        assertThat(actual.get(2).getCarName()).isEqualTo(expected.get(2).getCarName());
    }

}
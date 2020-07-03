/*
 * CarNamesTest.java            1.1       2020-07-03
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * CarNameTest.class
 * 차 이름 잘 받는지 테스트
 *
 * @author 조연우
 * @version 1.1     2020년 7월 3일
 */

class CarNameTest {

    @DisplayName("CarName(string) - 이름 받아서 객체 생성")
    @ParameterizedTest
    @ValueSource(strings = {"dusd"})
    void CarName_GenerateInstance(final String name) {
        assertThat(new CarName(name)).isInstanceOf(CarName.class);
    }


    @DisplayName("validateName() - 이름 다섯글자 이내인지 검사")
    @ParameterizedTest
    @ValueSource(strings = {"testislongerthanfive"})
    void validate_InvalidInputName_ExceptionThrown(final String name) {
        assertThatThrownBy(() -> new CarName(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 다섯글자 이내입니다.");
    }

    @DisplayName("CarName.getCarName() - 이름 반환")
    @ParameterizedTest
    @ValueSource(strings = {"test"})
    void CarName_ReturnString(final String name) {
        String expected = "test";
        String actual = new CarName(name).getCarName();
        assertThat(actual).isEqualTo(expected);
    }

}
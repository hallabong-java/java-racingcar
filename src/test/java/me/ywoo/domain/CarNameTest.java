/*
 * CarNameTest.java            1.1       2020-06-23
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
 * @version 1.1     2020년 6월 23일
 */

class CarNameTest {

    @DisplayName("Car() - 이름 받아서 객체 생성")
    @ParameterizedTest
    @ValueSource(strings = {"dusdndpdy", "hello"})
    void CarName_GenerateInstance(final String name){
        assertThat(new CarName(name)).isInstanceOf(CarName.class);
    }

    @DisplayName("validate() - 이름 다섯글자 이내인지 검사")
    @ParameterizedTest
    @ValueSource(strings = {"dusdn", "je", "lkjdfedd"})
    void CarName_InvalidName_IllegalArgumentExceptionThrown(final String name){
        assertThatThrownBy(()->new CarName(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 다섯글자 이내입니다.");
    }

    @DisplayName("splitName() - 문자열로 받아서 이름 잘 나누는지 검사")
    @ParameterizedTest
    @ValueSource(strings = {"dusd, ei, wer1-"})
    void CarName_SplitName(final String names){
        assertThat(new CarName(names)).isInstanceOf(CarName.class);
    }

}
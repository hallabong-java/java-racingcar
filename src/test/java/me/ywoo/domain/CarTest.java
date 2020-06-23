/*
 * CarTest.java            1.0       2020-06-22
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

/**
 * CarTest.class
 * Car 객체 잘 받아오는지 테스트
 *
 * @author 조연우
 * @version 1.0     2020년 6월 22일
 */

class CarTest {

    @DisplayName("Car() - 이름 받아서 객체 생성")
    @ParameterizedTest
    @ValueSource(strings = {"dus,hello,hi"})
    void Car_GenerateInstance(String[] names){
        assertThat(new Car()).isInstanceOf(Car.class);
    }
}
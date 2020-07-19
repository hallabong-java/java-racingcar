/*
 * CarTest.java            2.0       2020-07-02
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * CarTest.class
 * Car 객체 잘 받아오는지 테스트
 *
 * @author 조연우
 * @version 2.0     2020년 7월 2일
 */

class CarTest {

    @DisplayName("Car(names)_이름 받아서 객체 생성")
    @Test
    void Car_GenerateInstance() {
        assertThat(new Car(new CarName("test"), new CarPosition(1)))
                .isInstanceOf(Car.class);
    }

}
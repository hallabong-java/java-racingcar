/*
 * CarTest.java            1.0       2020-06-22
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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

    @DisplayName("Car(names) - 이름 받아서 객체 생성")
    @Test
    void Car_GenerateInstance(String names) {
        assertThat(new Car("dusdn", 1)).isInstanceOf(Car.class);
    }

    @DisplayName("숫자가 4보다 작으면 위치를 그대로 유지")
    @Test
    public void move_NumberIsLessThanFour_KeepPosition() {
        final Car car = new Car("test", 1);
        car.movePosition(3);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @DisplayName("숫자가 4보다 크거나 같으면 위치를 1 증가")
    @Test
    public void move_NumberIsEqualOrGreaterThanFour_IncreasePositionByOne() {
        final Car car = new Car("test", 1);
        car.movePosition(4);
        assertThat(car.getPosition()).isEqualTo(2);
    }

}
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
        assertThat(new Car(new CarName("test"), 1)).isInstanceOf(Car.class);
    }

    @DisplayName("movePosition()_숫자가 4보다 작으면 위치를 그대로 유지")
    @Test
    public void move_NumberIsLessThanFour_KeepPosition() {
        final Car car = new Car(new CarName("test"), 1);
        car.movePosition(3);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @DisplayName("movePosition()_숫자가 4보다 크거나 같으면 위치를 1 증가")
    @Test
    public void move_NumberIsEqualOrGreaterThanFour_IncreasePositionByOne() {
        final Car car = new Car(new CarName("test"), 1);
        car.movePosition(4);
        assertThat(car.getPosition()).isEqualTo(2);
    }

    @DisplayName("isWinner()_position이 같은 객체면 true 반환")
    @Test
    public void return_True_SamePosition() {
        final Car testCar1 = new Car(new CarName("test"), 4);
        boolean actual = testCar1.isWinnerToo(4);
        assertThat(actual).isEqualTo(true);
    }

}
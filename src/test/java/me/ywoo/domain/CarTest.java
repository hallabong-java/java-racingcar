package me.ywoo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class CarTest {

    @DisplayName("Car() - 이름 받아서 객체 생성")
    @ParameterizedTest
    @ValueSource(strings = {"dus", "hello"})
    void Car_GenerateInstance(String name){
        assertThat(new Car()).isInstanceOf(Car.class);
    }
}
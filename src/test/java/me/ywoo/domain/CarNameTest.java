package me.ywoo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class CarNameTest {

    @DisplayName("CarName(string) - 이름 받아서 객체 생성")
    @ParameterizedTest
    @ValueSource(strings = {"dusd"})
    void CarName_GenerateInstance(final String name) {
        assertThat(new CarName(name)).isInstanceOf(CarName.class);
    }

    @DisplayName("CarName.getCarName() - 이름 반환")
    @ParameterizedTest
    @ValueSource(strings = {"test"})
    void CarName_ReturnString(final String name) {
        String expected= "test";
        String actual= new CarName(name).getCarName();
        assertThat(actual).isEqualTo(expected);
    }
}
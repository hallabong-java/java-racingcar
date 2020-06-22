package me.ywoo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CarNameTest {
    @DisplayName("Car() - 이름 받아서 객체 생성")
    @ParameterizedTest
    @ValueSource(strings = {"dusdndpdy", "hello"})
    void Car_GenerateInstance(final String name){
        assertThat(new CarName(name)).isInstanceOf(Car.class);
    }

    @DisplayName("validate() - 이름 다섯글자 이내인지 검사")
    @ParameterizedTest
    @ValueSource(strings = {"dusdn", "je", "lkjdfedd"})
    void Car_InvalidName_IllegalArgumentExceptionThrown(final String name){
        assertThatThrownBy(()->new CarName(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 다섯글자 이내입니다.");
    }
}
package me.ywoo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarsTest {
    @DisplayName("validateCars() - 유효하지 않은 리스트 예외처리")
    @Test
    void validateCars_invalidList_exceptionThrown(){
        assertThatThrownBy(()->new Cars(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차가 없습니다");
    }
}
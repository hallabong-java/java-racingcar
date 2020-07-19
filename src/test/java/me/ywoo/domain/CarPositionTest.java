package me.ywoo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarPositionTest {

    @DisplayName("CarPosition() - 객체 생성 테스트")
    @Test
    void Position_GenerateInstance(){
        assertThat(new CarPosition(5)).isInstanceOf(CarPosition.class);
    }

    @DisplayName("validatePosition() - 유효하지 않은 위치 예외처리")
    @Test
    void validatePosition_invalidPosition_exceptionThrown(){
        assertThatThrownBy(()->new CarPosition(-2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("유효하지 않은 위치");
    }

    @DisplayName("movePosition()_위치를 movingUnit만큼 증가")
    @Test
    public void move_NumberIsEqualOrGreaterThanFour_IncreasePositionByOne() {
        CarPosition carPosition = new CarPosition(1);
        carPosition.movePosition(1);
        assertThat(carPosition.getPosition()).isEqualTo(2);
    }

}
package me.ywoo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PositionTest {

    @DisplayName("Position() - 객체 생성 테스트")
    @Test
    void Position_GenerateInstance(){
        assertThat(new Position(5)).isInstanceOf(Position.class);
    }

    @DisplayName("validatePosition() - 유효하지 않은 위치 예외처리")
    @Test
    void validatePosition_invalidPosition_exceptionThrown(){
        assertThatThrownBy(()->new Position(-2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("유효하지 않은 위치");
    }

    @DisplayName("movePosition()_위치를 movingUnit만큼 증가")
    @Test
    public void move_NumberIsEqualOrGreaterThanFour_IncreasePositionByOne() {
        Position position = new Position(1);
        position.movePosition(1);
        assertThat(position.getPosition()).isEqualTo(2);
    }

    @DisplayName("isSame()_position이 같은 객체면 true 반환")
    @Test
    public void return_True_SamePosition() {
        final Position testPosition1 = new Position(4);
        boolean actual = testPosition1.isSame(4);
        assertThat(actual).isEqualTo(true);
    }

    @DisplayName("isSame()_position이 다른 객체면 false 반환")
    @Test
    public void return_False_SamePosition() {
        final Position testPosition1 = new Position(4);
        boolean actual = testPosition1.isSame(5);
        assertThat(actual).isEqualTo(false);
    }
}
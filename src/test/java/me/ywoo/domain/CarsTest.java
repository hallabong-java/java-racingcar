package me.ywoo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarsTest {
    @DisplayName("validateCars() - 유효하지 않은 리스트 예외처리")
    @Test
    void validateCars_invalidList_exceptionThrown(){
        assertThatThrownBy(()->new Cars(null))
                .isInstanceOf(NullPointerException.class);
    }

    @DisplayName("isSame()_position이 같은 객체면 true 반환")
    @Test
    public void return_True_SamePosition() {
        final Car testCar = new Car(new CarName("test1"),new CarPosition(4));
        boolean actual = testCar.isSamePosition(4);
        assertThat(actual).isEqualTo(true);
    }

    @DisplayName("isSame()_position이 다른 객체면 false 반환")
    @Test
    public void return_False_SamePosition() {
        final Car testCar = new Car(new CarName("test1"),new CarPosition(4));
        boolean actual = testCar.isSamePosition(5);
        assertThat(actual).isEqualTo(false);
    }
}
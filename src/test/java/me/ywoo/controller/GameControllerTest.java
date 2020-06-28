package me.ywoo.controller;

import me.ywoo.domain.CarName;
import me.ywoo.domain.Game;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class GameControllerTest {
    @DisplayName("validCount()_유효한수인지확인")
    @ParameterizedTest
    @ValueSource(strings = {"-1", "0"})
    void checkCountIsValid(String inputPlayCounts){
        assertThatThrownBy(()->new GameController(new CarName("test1"), new Game(new CarName("test1"))))
                .isInstanceOf(GameController.class)
                .hasMessage("1회 이상 게임해야 합니다.");
    }

}
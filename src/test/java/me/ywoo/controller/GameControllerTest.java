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
    @Test
    void checkCountIsValid(String inputPlayCounts) {
        assertThatThrownBy(() -> new GameController())
                .isInstanceOf(GameController.class)
                .hasMessage("1회 이상 게임해야 합니다.");
    }

}
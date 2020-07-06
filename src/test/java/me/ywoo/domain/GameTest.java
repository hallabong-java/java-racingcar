/*
 * GameTest.java            2.1       2020-07-03
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * GameTest.class
 * 게임을 진행을 테스트하는 클래스
 *
 * @author 조연우
 * @version 2.1     2020년 7월 3일
 */

class GameTest {

    @DisplayName("Game()-List에 car객체들을 생성하는 함수")
    @Test
    void Game_GenerateInstance() {
        assertThat(new Game(new CarsFactory("hi,hello"))).isInstanceOf(Game.class);
    }

    @DisplayName("Game()-받아온 이름에 아무것도 없을때 예외처리하는 함수")
    @Test
    void Game_Except_Null_Instance() {
        assertThatThrownBy(() -> new Game(new CarsFactory("")))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("there is nothing");
    }
}
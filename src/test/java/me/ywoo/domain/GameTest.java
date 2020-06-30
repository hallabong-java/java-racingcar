/*
 * GameTest.java            1.1       2020-06-30
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
 * @version 1.1     2020년 6월 30일
 */

class GameTest {

    @DisplayName("Game()-List에 car객체들을 생성하는 함수")
    @Test
    void Game_GenerateInstance() {
        assertThat(new Game(new CarName("hi,hello"))).isInstanceOf(Game.class);
    }

    @DisplayName("Game()-null 에러 예외처리하는 함수")
    @Test
    void Game_Except_Null_Instance() {
        assertThatThrownBy(() -> new Game(new CarName("")))
                .isInstanceOf(NullPointerException.class)
                .hasMessage("null pointer");
    }
}
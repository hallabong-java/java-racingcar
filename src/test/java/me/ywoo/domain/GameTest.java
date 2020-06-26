/*
 * GameTest.java            1.0       2020-06-23
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * GameTest.class
 * 게임을 진행을 테스트하는 클래스
 *
 * @author 조연우
 * @version 1.0     2020년 6월 26일
 */

class GameTest {

    @DisplayName("Game()-List에 car객체들을 생성하는 함수")
    @Test
    void Game_GenerateInstance(){
        //List<String> actual = (new Game(new CarName("hi,hello"))).
        //List<String> expected = Arrays.asList("", "hi", "hello");
        assertThat(new Game(new CarName("hi,hello"))).isInstanceOf(Game.class);
    }
}
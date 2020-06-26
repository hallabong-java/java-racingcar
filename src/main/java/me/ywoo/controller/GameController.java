/*
 * GameController.java            1.0       2020-06-23
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.controller;

import me.ywoo.domain.Car;
import me.ywoo.domain.CarName;
import me.ywoo.domain.Game;
import me.ywoo.view.InputView;

/**
 * GameController.class
 * 게임을 진행하는 클래스
 *
 * @author 조연우
 * @version 1.0     2020년 6월 23일
 */

public class GameController {
    private CarName carName = new CarName(InputView.receiveNames());

    public void gameStart(){
        Game game = new Game(carName);

    }
}

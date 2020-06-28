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

import java.util.List;

/**
 * GameController.class
 * 게임을 진행하는 클래스
 *
 * @author 조연우
 * @version 1.0     2020년 6월 23일
 */

public class GameController {
    private CarName carName;
    private Game game;
    private int playCounts;

    public GameController(CarName carName, Game game){
        validCount(InputView.receiveNumber());
        carName = new CarName(InputView.receiveNames());
        game = new Game(carName);
    }

    public void validCount(String inputPlayCount){
        playCounts = Integer.parseInt(inputPlayCount);
        if (playCounts<1){
            throw new IllegalArgumentException("1회 이상 게임해야 합니다.");
        }
    }

    public void gameStart(){
        while(playCounts>0){
            game.moveAllCars();
            playCounts--;
        }
        game.findWinner();
        List<Car> winners = game.getWinners();
    }
}

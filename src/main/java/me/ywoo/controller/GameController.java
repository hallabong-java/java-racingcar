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
import me.ywoo.view.OutputView;

import java.util.List;

/**
 * GameController.class
 * 게임을 진행하는 클래스
 *
 * @author 조연우
 * @version 1.0     2020년 6월 23일
 */

public class GameController {
    private static final int MINIMUM_TO_GAME = 0;

    private CarName carName;
    private Game game;
    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();

    public List<String> winners;
    private int playCounts;

    public void run() {
        carName = new CarName(inputView.receiveNames());
        String inputPlayCounts = inputView.receiveNumber();
        validCount(inputPlayCounts);
        game = new Game(carName);
        gameStart();
    }

    public void validCount(String inputPlayCount) {
        playCounts = Integer.parseInt(inputPlayCount);
        if (playCounts <= MINIMUM_TO_GAME) {
            throw new IllegalArgumentException("1회 이상 게임해야 합니다.");
        }
    }

    public void gameStart() {
        while (playCounts > MINIMUM_TO_GAME) {
            game.moveAllCars();
            List<Car> cars = game.getCars();
            for (Car car : cars) {
                OutputView.printEachCars(car.getName(), car.getPosition());
            }
            playCounts--;
        }
        game.findWinner();
        winners = game.getWinners();
        OutputView.printWinners(winners);

    }
}

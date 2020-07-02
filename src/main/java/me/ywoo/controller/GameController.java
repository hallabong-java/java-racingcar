/*
 * GameController.java            2.0       2020-07-02
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.controller;

import me.ywoo.domain.Car;
import me.ywoo.domain.CarNames;
import me.ywoo.domain.Game;
import me.ywoo.view.InputView;
import me.ywoo.view.OutputView;

import java.util.ArrayList;
import java.util.List;

/**
 * GameController.class
 * 게임을 진행하는 클래스
 *
 * @author 조연우
 * @version 2.0     2020년 7월 2일
 */

public class GameController {
    private static final int MINIMUM_TO_GAME = 0;
    private List<String> winners = new ArrayList<String>();
    private int playCounts;

    public void run() {
        CarNames carNames = new CarNames(InputView.receiveNames());
        String inputPlayCounts = InputView.receiveNumber();
        validCount(inputPlayCounts);
        Game game = new Game(carNames);
        gameStart(game);
    }

    private void validCount(String inputPlayCount) {
        playCounts = Integer.parseInt(inputPlayCount);
        if (playCounts <= MINIMUM_TO_GAME) {
            throw new IllegalArgumentException("1회 이상 게임해야 합니다.");
        }
    }

    private void gameStart(Game game) {
        OutputView.printResult();
        while (playCounts > MINIMUM_TO_GAME) {
            game.moveAllCars();
            List<Car> cars = game.getCars();
            for (Car car : cars) {
                OutputView.printEachCars(car.getName(), car.getPosition());
            }
            OutputView.println();
            playCounts--;
        }
        winners = game.getWinners(game.findWinner());
        OutputView.printWinners(winners);
    }
}

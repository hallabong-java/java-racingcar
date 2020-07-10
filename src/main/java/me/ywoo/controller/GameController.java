/*
 * GameController.java            2.0       2020-07-02
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.controller;

import me.ywoo.domain.*;
import me.ywoo.view.InputView;
import me.ywoo.view.OutputView;

/**
 * GameController.class
 * 게임을 진행하는 클래스
 *
 * @author 조연우
 * @version 2.0     2020년 7월 2일
 */

public class GameController {
    private static final int MINIMUM_TO_GAME = 0;

    public void run() {
        Cars cars = new Cars(CarsFactory.generateCars(InputView.receiveNames()));
        AttemptNumber attemptNumber = new AttemptNumber(InputView.receiveNumber());
        gameStart(cars, attemptNumber.countsOfPlays);
    }

    private void gameStart(Cars cars, int countsOfPlays) {
        OutputView.printResult();

        while (countsOfPlays-- > MINIMUM_TO_GAME) {
            cars.moveAllCars();
            for (Car car : cars.getCars()) {
                OutputView.printEachCars(car.getName(), car.getPosition());
            }
            OutputView.println();
        }

        OutputView.printWinners(Cars.findWinners());
    }
}

/*
 * GameController.java            2.0       2020-07-02
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.controller;

import me.ywoo.domain.Car;
import me.ywoo.domain.CarsFactory;
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
    private int countsOfPlays;

    public void run() {
        CarsFactory carsFactory = new CarsFactory();

        String inputPlayCounts = InputView.receiveNumber();
        validateCount(inputPlayCounts);
        Game game = new Game(carsFactory);
        gameStart(game);
    }

    private void validateCount(String inputPlayCount) {
        try {
            countsOfPlays = Integer.parseInt(inputPlayCount);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("횟수는 숫자를 입력해야 합니다.");
        }
        if (countsOfPlays <= MINIMUM_TO_GAME) {
            throw new IllegalArgumentException("1회 이상 게임해야 합니다.");
        }
    }

    private void gameStart(Game game) {
        List<String> winners = new ArrayList<String>();
        OutputView.printResult();

        while (countsOfPlays > MINIMUM_TO_GAME) {
           // game.moveAllCars();

            List<Car> cars = game.getCars();
            for (Car car : cars) {
                OutputView.printEachCars(car.getName(), car.getPosition());
            }
            OutputView.println();
            countsOfPlays--;
        }

        winners = game.findWinners();
        OutputView.printWinners(winners);
    }
}

/*
 * Game.java            1.2      2020-06-27
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Game.class
 * 게임을 진행하는 클래스
 *
 * @author 조연우
 * @version 1.3     2020년 6월 30일
 */

public class Game {
    private static final int INITIALIZE = 0;

    private List<Car> cars = new ArrayList<Car>();
    public List<Car> winners = new ArrayList<Car>();
    List<String> winnersName = new ArrayList<String>();

    public Game(CarName carName) {
        for (String thisCarName : carName.getName()) {
            Car addCar = new Car(thisCarName, INITIALIZE);
            cars.add(addCar);
            //throw new NullPointerException("null pointer");
        }
    }

    public void moveAllCars() {
        RandomNumber randomNumber = new RandomNumber();
        for (Car car : cars) {
            car.movePosition(randomNumber.generateRandomNumber());
        }
    }

    public List<Car> findWinner() {
        Car winnerCar = cars.stream()
                .max(Car::compareTwoPositions)
                .get();
        winners = cars.stream()
                .filter(car -> car.isWinnerToo(winnerCar))
                .collect(Collectors.toList());
        return winners;
    }

    public List<String> getWinners(List<Car> winners) {
        for (Car winner : winners) {
            winnersName.add(winner.getName());
        }
        return winnersName;
    }

    public List<Car> getCars() {
        return cars;
    }
}

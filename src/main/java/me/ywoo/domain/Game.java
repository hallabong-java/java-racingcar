/*
 * Game.java            2.1      2020-07-03
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
 * @version 2.1     2020년 7월 3일
 */

public class Game {
    private static final int INITIALIZE = 0;

    private List<Car> cars = new ArrayList<Car>();
    private List<String> winnersName = new ArrayList<String>();

    public Game(CarNames carNames) {
        for (CarName thisCarName : carNames.getNameArray()) {
            Car addCar = new Car(thisCarName, INITIALIZE);
            cars.add(addCar);
            if (thisCarName.getCarName().equals("")) throw new IllegalArgumentException("there is nothing");
        }
    }

    public void moveAllCars() {
        RandomNumber randomNumber = new RandomNumber();
        for (Car car : cars) {
            car.movePosition(randomNumber.generateRandomNumber());
        }
    }

    public List<String> findWinners() {
        int winnerCarPosition = cars.stream()
                .map(Car::getPosition)
                .max(Integer::compareTo)
                .get();
        List<Car> winners = cars.stream()
                .filter(car -> car.isWinnerToo(winnerCarPosition))
                .collect(Collectors.toList());
        for (Car winner : winners) {
            winnersName.add(winner.getName());
        }
        return winnersName;
    }

    public List<Car> getCars() {
        return cars;
    }
}

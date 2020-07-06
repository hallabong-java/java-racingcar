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
    private static final int INITIALIZE_CAR_POSITION = 0;

    public Game(CarsFactory carsFactory) {
        for (Car car : Cars.getCars()) {
            Car addCar = new Car(thisCarName, new CarPosition());
            cars.add(addCar);
            if (thisCarName.getCarName().equals("")) {
                throw new IllegalArgumentException("there is nothing");
            }
        }
    }
/*
    public void moveAllCars() {
        for (Car car : cars) {
            car.movePosition(RandomNumber.generateRandomNumber());
        }
    }*/

    public List<String> findWinners() {
        int winnerCarPosition = cars.stream()
                .map(Car::getPosition)
                .max(Integer::compareTo)
                .orElse(null);

        List<String> winners = cars.stream()
                //.filter(car -> car.isSame(winnerCarPosition))
                .map(Car::getName)
                .collect(Collectors.toList());

        return winners;
    }

    public List<Car> getCars() {
        return cars;
    }
}

/*
 * Game.java            1.2      2020-06-27
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Game.class
 * 게임을 진행하는 클래스
 *
 * @author 조연우
 * @version 1.2     2020년 6월 27일
 */

public class Game {
    private List<Car> cars;
    public List<Car> winners;
    //int countCars = carName.getName().size();

    public Game(CarName carName) {
        for (String thisCarName : carName.getName()) {
            cars.add(new Car(thisCarName, 0));
        }
    }

    public void moveAllCars() {
        RandomNumber randomNumber = new RandomNumber();
        for (Car car : cars) {
            car.movePosition(randomNumber.generateRandomNumber());
        }
    }

    public void findWinner() {
        Car winnerCar = cars.stream()
                .max(Car::compareTwoPositions)
                .get();
        winners = cars.stream()
                .filter(car -> car.isWinnerToo(winnerCar))
                .collect(Collectors.toList());
    }

    public List<String> getWinners() {
        List<String> winnersName = null;
        for (Car winner : winners) {
            winnersName.add(winner.getName());
        }
        return winnersName;
    }

    public List<Car> getCars(){
        return cars;
    }
}

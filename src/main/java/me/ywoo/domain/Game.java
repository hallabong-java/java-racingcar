/*
 * Game.java            1.1      2020-06-26
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

import me.ywoo.view.InputView;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Game.class
 * 게임을 진행하는 클래스
 *
 * @author 조연우
 * @version 1.1     2020년 6월 26일
 */

public class Game {
    private List<Car> cars;
    //int countCars = carName.getName().size();

    public Game(CarName carName) {
        for(String thisCarName : carName.getName()){
            cars.add(new Car(thisCarName, 0));
        }
    }

    public void moveAllCars(){
        RandomNumber randomNumber = new RandomNumber();
        for(Car car : cars){
            car.movePosition(randomNumber.generateRandomNumber());
        }
    }

  //  public List<String> findWinner(){

  //  }

}

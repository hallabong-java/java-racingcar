/*
 * CarsFactory.java            3.0       2020-07-06
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * CarsFactory.class
 * Car 객체들 만드는 CarsFactory 생성
 *
 * @author 조연우
 * @version 3.0     2020년 7월 6일
 */

public class CarsFactory {

    public static List<Car> Cars;

    public static void generateCars(final String carNames) {
        for (String name : carNames.split(",")) {
            Car newCar = new Car(new CarName(name), new Position());
            Cars.add(newCar);
        }
    }

    public List<Car> getCars() {
        return Cars;
    }
}

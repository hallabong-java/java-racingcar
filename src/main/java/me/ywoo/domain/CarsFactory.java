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
    private static final String DELIMITER = ",";

    public static List<Car> generateCars(final String carNames) {
        List<Car> cars = new ArrayList<Car>();
        for (String name : carNames.split(DELIMITER)) {
            Car newCar = new Car(new CarName(name), new CarPosition());
            cars.add(newCar);
        }
        return cars;
    }
}

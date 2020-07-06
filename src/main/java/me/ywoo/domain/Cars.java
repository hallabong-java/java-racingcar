package me.ywoo.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {
    public static List<Car> cars;

    public Cars(final List<Car> cars) {
        validateCars(cars);
        this.cars = cars;
    }

    private void validateCars(final List<Car> cars){
        Objects.requireNonNull(cars, "자동차가 없습니다.");
        if(cars.isEmpty()){
            throw new IllegalArgumentException("자동차가 없습니다.");
        }
    }

    public static void addCar(final Car car){
        cars.add(car);
    }

    public static List<Car> getCars() {
        return cars;
    }
}

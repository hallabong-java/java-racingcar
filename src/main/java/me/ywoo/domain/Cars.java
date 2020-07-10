package me.ywoo.domain;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Cars {
    public List<Car> cars;

    public Cars(final List<Car> cars) {
        validateCars(cars);
        this.cars = cars;
    }

    private void validateCars(final List<Car> cars) {
        Objects.requireNonNull(cars, "자동차가 없습니다.");
        if (cars.isEmpty()) {
            throw new IllegalArgumentException("자동차가 없습니다.");
        }
    }

    public List<String> findWinners() {
        int NeedCarPosition = cars.stream()
                .map(Car::getPosition)
                .max(Integer::compareTo)
                .orElseThrow(null) ;

        return cars.stream()
                .filter(car->car.isSamePosition(NeedCarPosition))
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    public void moveAllCars() {
        for (Car car : cars) {
            car.moveCar(RandomNumber.generateRandomNumber());
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}

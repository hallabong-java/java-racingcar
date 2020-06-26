package me.ywoo.domain;

import java.util.Random;

public class RandomNumber {

    public RandomNumber() {
        generateRandomNumber();
    }

    private static final int BOUNDARY = 10;

    public static int generateRandomNumber(){
        return new Random().nextInt(BOUNDARY);
    }
}

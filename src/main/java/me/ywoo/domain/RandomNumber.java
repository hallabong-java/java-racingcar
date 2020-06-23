package me.ywoo.domain;

import java.util.List;
import java.util.Random;

import static java.util.stream.Collectors.toList;

public class RandomNumber {

    private static final int BOUNDARY_ZERO = 0;
    private static final int BOUNDARY_NINE = 9;

    public List<Integer> generateRandomNumber(int nameSize){
        return new Random().ints(BOUNDARY_ZERO,BOUNDARY_NINE)
                .limit(nameSize)
                .boxed()
                .collect(toList());
    }
}

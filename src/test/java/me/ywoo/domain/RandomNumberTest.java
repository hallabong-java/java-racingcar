package me.ywoo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RandomNumberTest {

    @DisplayName("randomNumber() - 0부터 9까지의 랜덤 숫자 생성")
    @ParameterizedTest
    @ValueSource(ints = {8,2,3})
    void rightRandomNumber(){
        RandomNumber randomNumber = new RandomNumber();
        //List<Integer> numbers = randomNumber.generateRandomNumber(int size);

        //assertThat(numbers).hasSize(nameSize);
    }
}
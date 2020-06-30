/*
 * InputView.java            1.1       2020-06-30
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.view;

import java.util.List;

/**
 * InputView.class
 * 사용자로부터 입력 받는 클래스
 *
 * @author 조연우
 * @version 1.1     2020년 6월 30일
 */

public class OutputView {
    public static void printResult() {
        System.out.println("실행결과");
    }

    public static void println() {
        System.out.println();
    }

    public static void printEachCars(String carName, int positions) {
        System.out.print(carName + " : ");
        for (int i = 0; i < positions; i++) {
            System.out.print('-');
        }
        System.out.println();
    }

    public static void printWinners(List<String> winners) {
        String winnerNames = String.join(", ", winners);
        System.out.println(winnerNames + "가 최종 우승했습니다.");
    }
}

/*
 * InputView.java            1.0       2020-06-23
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.view;

import java.util.Scanner;

/**
 * InputView.class
 * 사용자로부터 입력 받는 클래스
 *
 * @author 조연우
 * @version 1.0     2020년 6월 23일
 */

public class InputView {
    private static final Scanner scan = new Scanner(System.in);

    public static String receiveNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분");
        return scan.nextLine();
    }

    public static String receiveNumber() {
        System.out.println("시도할 횟수는 몇회인가요?");
        return scan.nextLine();
    }
}

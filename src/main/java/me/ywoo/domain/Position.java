/*
 * Position.java            1.0       2020-07-06
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package me.ywoo.domain;

/**
 * Position.class
 * Position 객체 생성
 *
 * @author 조연우
 * @version 1.0     2020년 7월 6일
 */

public class Position {
    private static final int INITIAL_POSITION = 0;

    public int position;

    public Position(int position) {
        validatePosition(position);
        this.position = position;
    }

    public Position() {
        this(INITIAL_POSITION);
    }

    public void movePosition(int movingUnit) {
        this.position += movingUnit;
    }

    public void validatePosition(int position) {
        if (position < INITIAL_POSITION) {
            throw new IllegalArgumentException("유효하지 않은 위치");
        }
    }

    public boolean isSame(int comparedPosition) {
        return this.position == comparedPosition;
    }

    public int getPosition() {
        return position;
    }
}

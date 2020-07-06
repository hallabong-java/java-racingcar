package me.ywoo.domain;

public class AttemptNumber {
    private static final int LOWER_BOUND_OF_ATTEMPT = 1;

    private static int countsOfPlays;

    public AttemptNumber(final int countsOfPlays) {
        validateNumber(countsOfPlays);
        this.countsOfPlays = countsOfPlays;
    }

    private void validateNumber(int number) {
        if(number<LOWER_BOUND_OF_ATTEMPT){
            throw new IllegalArgumentException("1회 이상 게임해야 합니다");
        }
    }

    public static int validateCount(String inputPlayCount) {
        try {
            countsOfPlays = Integer.parseInt(inputPlayCount);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("횟수는 숫자를 입력해야 합니다.");
        }
        return countsOfPlays;
    }
}

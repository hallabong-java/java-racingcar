package me.ywoo.view;

import java.util.List;

public class OutputView {

    public static void printEachCars(String carName, int positions){
        System.out.print(carName+" : ");
        for(int i =0 ;i<positions;i++){
            System.out.print('-');
        }
    }

    public static void printWinners(List<String> winners) {
        String winnerNames = String.join(", ", winners);
        System.out.print(winnerNames + "가 최종 우승했습니다.");
    }
}

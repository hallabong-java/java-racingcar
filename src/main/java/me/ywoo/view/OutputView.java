package me.ywoo.view;

public class OutputView {
    public static void printEachCars(String carName, int positions){
        System.out.print(carName+" : ");
        for(int i =0 ;i<positions;i++){
            System.out.print('-');
        }
    }
}

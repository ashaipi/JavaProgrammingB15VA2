package day30_review;

import java.time.chrono.MinguoDate;

public class CarInfo {
    public static void main(String[] args) {
        String car = "MINI-Cooper";
        // MINI-Cooper --> MINI-******
        // Infiniti-QX56 -> Infiniti-****
        /*
            Split or use substring, and get make and model
            Count number of chars in model and using a loop
            build that many stars
         */
        System.out.print(car.substring(0,car.indexOf("-")+1));
        for (int i = 0; i < (car.substring(car.indexOf("-")+1)).length() ; i++) System.out.print("*");

        System.out.println();

        String[] carArray = car.split("-");
        System.out.print(carArray[0]+"-");
        for (int i = 0; i <carArray[1].length() ; i++) System.out.print("*");

    }
}

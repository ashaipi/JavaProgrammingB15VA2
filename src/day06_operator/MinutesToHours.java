package day06_operator;

import java.util.Scanner;

public class MinutesToHours {
    public static void main(String[] args){
        int minutes=1000;
        int hours = minutes /60;
        int remainingMinutes = minutes % 60;

        System.out.println(hours+" hours "+remainingMinutes+" minutes");

    }
}

package day05_practice_scanner_math;

import java.util.Scanner;

public class ScannerSpeedCheck {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Speed Check Program.");
        System.out.print("Enter your current speed: ");
        int currentSpeed = in.nextInt();
        //System.out.println("current speed: "+currentSpeed);
        int speedLimit=55;
        int overTheLimit=currentSpeed-speedLimit;
        System.out.println("You are driving "+overTheLimit+" mph over the limit!");


    }
}

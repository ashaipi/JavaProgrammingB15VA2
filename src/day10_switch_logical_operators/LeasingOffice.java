package day10_switch_logical_operators;

import java.sql.SQLOutput;

public class LeasingOffice {
    public static void main(String[] args) {
        double startingPrice = 0.0;
        int numberOfBedrooms = 1;

        System.out.println("Welcome to Cybertek Apartments!");
        switch (numberOfBedrooms) {
            case 0:
                System.out.println("Studio is selected");
                        startingPrice = 1200.0;
                break;
            case 1:
                System.out.println("One bedroom is selected");
                startingPrice = 1400;
                break;
            case 2:
                System.out.println("two bedroom is selected");
                startingPrice = 1650.0;
                break;
            case 3:
                System.out.println("three bedroom is selected");
                startingPrice = 2250;
                break;
            default:
                System.out.println("No Such bedroom available");
        }
        if(startingPrice>0.0) System.out.println("Starting price "+startingPrice);
    }
}

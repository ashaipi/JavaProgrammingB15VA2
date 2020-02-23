package day05_practice_scanner_math;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] age){
        int speedLimit, currentSpeed, overTheLimit;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter speed limit: ");
        speedLimit = in.nextInt();
        System.out.print("Enter current speed: ");
        currentSpeed=in.nextInt();
        overTheLimit=currentSpeed-speedLimit;
        //You are driving 35 mph over the limit. Be careful!
        System.out.println("You are driving "+overTheLimit+" mph over the limit. Be careful!");

    }
}

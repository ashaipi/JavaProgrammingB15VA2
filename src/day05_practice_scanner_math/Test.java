package day05_practice_scanner_math;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
        {
            //YOUR CODE HERE
            int areaCode, localNumber;
            String phoneNumber;

            Scanner in = new Scanner(System.in);

            areaCode=in.nextInt();
            localNumber=in.nextInt();

            phoneNumber="Calling number ("+areaCode+")-"+localNumber;

            System.out.println(phoneNumber);
        }

}

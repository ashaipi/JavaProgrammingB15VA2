package day17_while_do_while_loop;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int secretNumber=random.nextInt(100);

        int guessingNumber=0;

        do {
            System.out.println("Guess the secret Number:");
            guessingNumber = scan.nextInt();
            if(guessingNumber>secretNumber) System.out.println("Wrong, your number is too large");
            else if(guessingNumber<secretNumber) System.out.println("Wrong, your number is to small");
            else {System.out.println("Congratulation, you won!"); break;}
        }while(true);





    }
}

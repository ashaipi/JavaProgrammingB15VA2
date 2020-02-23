package day05_practice_scanner_math;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = in.nextInt();
        in.nextLine();
        System.out.print("Enter second number: ");
        int secondNumber = in.nextInt();

        System.out.println("\nsum is "+(firstNumber+secondNumber));
    }

        }

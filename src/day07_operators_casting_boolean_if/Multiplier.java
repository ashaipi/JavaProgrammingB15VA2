package day07_operators_casting_boolean_if;

import java.util.Scanner;

public class Multiplier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        String result;

        System.out.println("Welcome to Multiplier!");
        System.out.println("Enter 2 numbers");
        num1=in.nextInt();
        num2=in.nextInt();

        result=num1+" x "+num2+" = "+(num1*num2);
        System.out.println(result);



    }
}

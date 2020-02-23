package day12_ternary_string_manipulation;

import java.util.Scanner;

public class CapitalCity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String capital;
        // What is the capital of Turkey?
        // Ankara
        // Your answer is correct!
        // Istanbul
        // Your answer is wrong!
        System.out.println("What is the capital of Turkey?");
        capital=in.next();
        if(capital.equalsIgnoreCase("Ankara"))
            System.out.println("Your answer is correct!");
        else
            System.out.println("Your answer is wrong");
    }
}

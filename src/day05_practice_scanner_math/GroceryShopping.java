package day05_practice_scanner_math;

import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Harris Teeter!");

        System.out.print("How much are potatoes? ");
        double potatoesPrice=in.nextDouble();
        in.nextLine();
        System.out.print("How much are tomatoes? ");
        double tomatoesPrice=in.nextDouble();
        in.nextLine();
        System.out.print("How much are eggplants? ");
        double eggplantsPrice=in.nextDouble();
        in.nextLine();

        System.out.println("Total is $"+(potatoesPrice+tomatoesPrice+eggplantsPrice));
    }
}

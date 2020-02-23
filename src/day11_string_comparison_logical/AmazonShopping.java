package day11_string_comparison_logical;

import java.util.Scanner;

public class AmazonShopping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Program to find out if transaction id eligible for free shipping

        System.out.println("Welcome to Amazon shopping!");

        System.out.println("Are you prime member? (yes/no)");
        String primeMember = in.next();
        boolean isPrimeMember;
        if (primeMember.equalsIgnoreCase("yes")) isPrimeMember = true;
        else isPrimeMember = false;

        System.out.println("Enter total order price:");
        double totalOrderPrice = in.nextDouble();
        boolean isTotalOrderPrice=(totalOrderPrice>=0) && (totalOrderPrice<=100);

        if ((isPrimeMember || totalOrderPrice >= 25.0) && isTotalOrderPrice)
            System.out.println("Your order is eligible for free shipping");
        else
            System.out.println("Your order is not eligible for free shipping");

    }
}

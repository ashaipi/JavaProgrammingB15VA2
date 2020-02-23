package day04_math_operators_scanner;

import java.util.Scanner;

public class WhatIsYourNameScanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        int i,j,k;
        char c1='a',c2='b',c3;

        i= (int) c1+ (int) c2;

        System.out.println(i);


        System.out.println("Enter first int number:");
        i= input.nextInt();
        System.out.println("Enter second int number:");
        j= input.nextInt();
        double d;
        System.out.println("Enter second double number:");
        d=input.nextDouble();

        System.out.println("The Sum is :"+(i+j)+" the double number is "+d);

        System.out.println("Nice to meet you, "+name);

    }
}

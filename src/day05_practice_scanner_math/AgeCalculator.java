package day05_practice_scanner_math;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args){
        String name;
        int yearOfBirth,currentYear,age;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        name=in.nextLine();
        System.out.print("Enter year of birth: ");
        yearOfBirth=in.nextInt();
        System.out.print("Enter current year: ");
        currentYear=in.nextInt();
        age=currentYear - yearOfBirth;
        System.out.println(age);
        //Adam Smith is 20 years old
        System.out.println(name+" is "+age+" years old");



    }

}

package assignment_nov_29_2019_task2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Ask user to enter full name
        assuming full name is 2 word
        Write a program to print users initials
        for example :
        Jon Snow -->> Initial is JS
         */
        System.out.println("Enter first and last name:");
        Scanner in = new Scanner(System.in);
        String fullName=in.nextLine();
        int lastNameIndex=fullName.indexOf(" ")+1;
        System.out.println(fullName+" -->> Initial is "+fullName.charAt(0)+fullName.substring(lastNameIndex,lastNameIndex+1));
    }
}

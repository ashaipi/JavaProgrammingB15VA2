package assignment_nov_29_2019_task2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        Ask user to enter full name
        assuming full name is 2 word
        Write a program generate email account as below:
        it starts with first character of first name
        and whole last name then @NightWatch.com
        for example :
        Jon Snow -->> JSnow@NightWatch.com
         */

        System.out.println("Enter first and last name:");
        Scanner in = new Scanner(System.in);
        String fullName=in.nextLine();
        int lastNameIndex=fullName.indexOf(" ")+1;
        String email = fullName.charAt(0)
                      +fullName.substring(lastNameIndex,fullName.length())
                      +"@NightWatch.com";

        System.out.println(fullName+" -->> "+email);


    }
}

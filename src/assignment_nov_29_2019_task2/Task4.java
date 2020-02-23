package assignment_nov_29_2019_task2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Ask user to enter a word with at least 3 characters
        print the first character
        print the last character
        print the middle character
        for example : Uighur
        first character : U
        last character  : r
        middle character: g
        (if the length is even number get the one on the left)
         */

        System.out.println("Enter a word with at least 3 characters:");
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        int middle = str.length();
        if(middle%2==0) middle = (middle/2)-1;
        else middle=middle/2;

        System.out.println("first character : "+str.charAt(0));
        System.out.println("last character  : "+str.charAt(str.length()-1));
        System.out.println("middle character: "+str.charAt(middle));

    }
}

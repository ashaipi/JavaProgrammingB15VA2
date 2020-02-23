package assignment_nov_29_2019_task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        When searching from google ,
        it will always show your search keyword in tab name
        for example if you search Java
        your tab title is : Java - Google Search

        Create a program to ask user to
        enter a String with any number of word
        Create a variable called searchKeyword to save user input
        Create another String variable called tabTitle
        assign tabTitle value to searchKeyword +  "- Google Search"

        Check if tabTitle start with your searchKeyword
        and end with - Google Search
        (Assume you don't know tab title is already correct
        in real world , we will capture it with automation)
         */
        System.out.println("Enter search keyword:");
        Scanner in = new Scanner(System.in);
        String searchKeyword=in.nextLine();
        System.out.println(searchKeyword+" - Google Search");
    }
}

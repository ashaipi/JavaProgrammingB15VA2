package day31_multidarrays_methods;

import java.util.*;

public class VotingCheck {
    public static void checkIfCanVote(int age){
        if(age>=18) System.out.println("Age ["+age+"] are eligible to vote");
        else if(age<=0) System.out.println("ERROR: birthYear is not a valid BirthYear");
        else System.out.println("Age ["+age+"] are not eligible to vote");
    }

    public static void printAge(int birthYear){
        int age =2019-birthYear;
        checkIfCanVote(age);
    }
    public static void main(String[] args) {
        checkIfCanVote(40);
        checkIfCanVote(18);
        checkIfCanVote(10);
        printAge(2002);
        printAge(1999);
        printAge(2019);
        var d = new Date();
        System.out.println(d);
    }
}

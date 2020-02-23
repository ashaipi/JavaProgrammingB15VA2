package day02_intro_to_variables;
/*
    Cybertek School- Day 02 Introduction to JAVA programming

    Author:       Abubaker Ashaipi
    Date Created: Nov 10, 2019
    Purpose:      Practice comments in Java
    Version:      0.1
 */


public class VariablesIntro {
    public static void main(String[] args){
        // declare variable
        int count;
        final int COUNT=10;
        // assign value 10 to count
        count = 10;

        System.out.println(count);

        // declare a variable apples
        int apples;
        // assign 5 to apples
        apples=5;
        // print value of apples
        System.out.println(apples);

        // Combine variable declaration and assignment together
        int student=100, teachers=85, people=10000;
        System.out.println((char) teachers);
        System.out.println("Student  = "+student+"\nTeachers = "+teachers+"\npeople   = "+people);




    }
}

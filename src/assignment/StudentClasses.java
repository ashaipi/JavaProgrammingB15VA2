package assignment;
/*
    Cybertek School- Day 03 Introduction to JAVA programming
    Author:       Abubaker Ashaipi
    Date Created: Nov 11, 2019
    Purpose:      Java Assignment 001:
                  Please review and create at least 20 variables of type int, double, String
                  and print them out by adding custom messages.
    Version:      0.01
*/
public class StudentClasses {
    public static void main(String[] args){
        // Declare two variable Student Account and ZipCode as numbers "integer number" using key word "int"
        int sAccountNumber, sZipCode;
        // Declare Student First, last name and phone number as characters using key word "String" as will as teacher name
        String sFName, sLastName, sPhoneNumber, teacherName;
        // Declare Student address as characters using key word "String"
        String sAddress, sCity, sState;

        // Declare Student grades as decimal numbers using key word "double"
        double algebraFG=80.5, algebraSG=90.4, algebraFinalG=100;
        double biologyFG=75.8, biologySG=100, biologyFinalG=100;
        double chemistryFG=100, chemistrySG=100, chemistryFinalG=100;
        double spanishFG=60.6, spanishSG=75.7, spanishFinalG=87.7;
        double danceFG=50.3, danceSG=66.4, danceFinalG=75.6;

        // Assign Student information to declared variables
        sFName="Abubaker";
        sLastName="Ashaipi";
        sPhoneNumber="(703)000-0000";
        teacherName="Noah";
        sAccountNumber=100000000;
        sZipCode=20171;
        sAddress="99999 West Ox R";
        sCity="Herndon";
        sState="VA";

        // Declare Student courses as decimal number using key word "double"
        // Assign to course variable the average of course tests
        double algebra = (algebraFG+algebraSG+algebraFinalG)/3;
        double chemistry= (chemistryFG+chemistrySG+chemistryFinalG)/3;
        double biology=(biologyFG+biologySG+biologyFinalG)/3;
        double spanish=(spanishFG+spanishSG+spanishFinalG)/3;
        double dance = (danceFG+danceSG+danceFinalG)/3;
        double avg = (algebra+chemistry+biology+spanish+dance)/5;

        // Print to screen Student information and course grades and final course grade
        System.out.println("Student Account Number: "+sAccountNumber);
        System.out.println("Student Name: "+sFName+" "+sLastName);
        System.out.println("Student Phone Number: "+sPhoneNumber);
        System.out.println("Student Address: "+sAddress+", "+sCity+", "+sState+" "+sZipCode);
        System.out.println();
        System.out.println("Teacher Name: "+teacherName);

        System.out.println("Algebra  -> First Test "+algebraFG+" Second Test "+algebraSG+" Final Test "+algebraFinalG+" Student Grade "+algebra);
        System.out.println("Chemistry-> First Test "+chemistryFG+" Second Test "+chemistrySG+" Final Test "+chemistryFG+" Student Grade "+chemistry);
        System.out.println("Biology  -> First Test "+biologyFG+" Second Test "+biologySG+" Final Test "+biologyFinalG+" Student Grade "+biology);
        System.out.println("Spanish  -> First Test "+spanishFG+" Second Test "+spanishSG+" Final Test "+spanishFinalG+" Student Grade "+spanish);
        System.out.println("Dance    -> First Test "+danceFG+" Second Test "+danceSG+" Final Test "+danceFinalG+" Student Grade "+dance);
        System.out.println();

        // Print in screen Student grade average
        System.out.println("Student Average is: "+avg);

    }
}

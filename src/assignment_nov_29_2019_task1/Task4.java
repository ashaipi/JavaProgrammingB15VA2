package assignment_nov_29_2019_task1;

public class Task4 {
    public static void main(String[] args) {
        /*
         given 3 whole numbers variable num1, num2 , num3 with value already set .
         Write a program with below logic
         it should print true if all the individual numbers are more than 100
         if not print not all numbers are more than 100
         */

        int num1=221, num2=210, num3=210;
        if(num1>100 && num2>100 && num3>100) System.out.println(true);
        else System.out.println("not all numbers are more than 100");
    }
}

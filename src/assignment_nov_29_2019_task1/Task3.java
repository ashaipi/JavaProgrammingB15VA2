package assignment_nov_29_2019_task1;

public class Task3 {
    public static void main(String[] args) {
        /*
         given 3 whole numbers variable num1, num2 , num3 with value already set .
         Write a program to
         find out the largest number and print the result
         */

        int num1=22, num2=210, num3=20;
        if(num1>num2 && num1>num3) System.out.println(num1);
        else if(num2>num1 && num2>num3) System.out.println(num2);
        else System.out.println(num3);
    }
}

package assignment_nov_29_2019_task1;

public class Task2 {
    public static void main(String[] args) {
        /*
         given 3 whole numbers variable  num1, num2 , num3 with value already set .
         and another int variable called sumOfSpecialNumber with initial value 0
         Write a program to print
         Only the sum of numbers that more than 20
         for example  10, 25, 30 . --->> 25+30=55
         */

        int num1=2, num2=10, num3=20, sumOfSpecialNumber=0;
        sumOfSpecialNumber=num1+num2+num3;
        if((num1+num2)>20) System.out.println(num1+"+"+num2+"="+(num1+num2));
        if((num1+num3)>20) System.out.println(num1+"+"+num3+"="+(num1+num3));
        if((num2+num3)>20) System.out.println(num2+"+"+num3+"="+(num2+num3));

    }
}

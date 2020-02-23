package assignment_nov_29_2019_task1;

public class Task1 {
    public static void main(String[] args) {
        /*
         given 3 whole numbers variable num1, num2 , num3 with value already set .
         If the sum of the numbers are more than 100 print you have won
         if not print sum of 3 numbers are not more than 100
         */
        int num1=20, num2=10, num3=20;

        if((num1+num2+num3)>100) System.out.println("you have won");
        else System.out.println((num1+num2+num3)+" are not more than 100");

    }
}

package assignment_nov_29_2019_task1;

public class Task5 {
    public static void main(String[] args) {
        /*
         given 3 whole numbers variable num1, num2 , num3 with value already set .
         Write a program with below logic
         add 100 to all the numbers less than 20 ;
         print out the value of each variable to test your code.
         */

        int num1=1, num2=210, num3=210;

        if(num1<20) num1 += 100;
        if(num2<20) num2 += 100;
        if(num3<20) num3 += 100;

        System.out.println("num1="+num1+", num2="+num2+", num3="+num3);
    }
}

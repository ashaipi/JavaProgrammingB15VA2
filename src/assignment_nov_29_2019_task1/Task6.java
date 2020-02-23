package assignment_nov_29_2019_task1;

public class Task6 {
    public static void main(String[] args) {
        /*
         given 3 whole numbers variable num1, num2 , num3 with value already set .
         Write a program with below logic

         if multiplication result of num1 and num2 greater than sum of all the numbers
                print excellent result
         else
            not the numbers combination I am looking for
         */

        int num1=100, num2=210, num3=210, multiplication=0, sum=0;
        sum=num1+num2+num3;
        multiplication=num1*num2;

        if(multiplication>(sum)) System.out.println("print excellent result");
        else System.out.println("not the numbers combination I am looking for");

    }
}

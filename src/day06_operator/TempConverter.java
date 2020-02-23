package day06_operator;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double fahrenheit = 0.0, celsius;
        System.out.println("Enter Fahrenheit value");
        fahrenheit=in.nextDouble();

        celsius=(fahrenheit-32)* 5/9;
        System.out.println(fahrenheit+" is "+celsius+" in celsius");

        System.out.println("Enter celsius value");
        fahrenheit=in.nextDouble();
        fahrenheit=(celsius*9/5)+32;
        System.out.println(celsius+" is "+fahrenheit+" in fahrenheit");


    }
}

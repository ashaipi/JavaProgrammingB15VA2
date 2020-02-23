package day06_operator;
import java.util.Scanner;

public class NextLine {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName1= scan.next();
        scan.nextLine();

        System.out.println("Hi, "+fullName1+", you did great! :)");
        String fullName2= scan.nextLine();
        System.out.println("Hi, "+fullName2+", you did great! :)");
    }
}

package day06_operator;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        int num;
        Scanner in = new Scanner(System.in);
        do {
            num = in.nextInt();

            if (num % 2 == 0) System.out.println(num + " is EVEN");
            else System.out.println(num + " is ODD");
        }while (num!=0);
    }
}

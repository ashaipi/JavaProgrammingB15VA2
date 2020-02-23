package day06_operator;
import java.util.Scanner;

public class DayToMinutes {
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int day, minutes;
            System.out.println("Enter number of days");
            day=in.nextInt();

            minutes = day * 1440;

            System.out.println(minutes+" minutes");
    }
}

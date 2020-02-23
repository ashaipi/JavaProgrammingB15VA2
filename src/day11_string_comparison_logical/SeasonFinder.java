package day11_string_comparison_logical;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter month number:");
        int month = in.nextInt();
        // Spring 3,4,5
        // Summer 6,7,8
        // Fall   9,10,11
        // Winter 12,1,2

        if (month >= 1 && month <=2) System.out.println("Winter");
        else if(month >= 3 && month <=5) System.out.println("Spring");
        else if(month >= 6 && month <=8) System.out.println("Summer");
        else if(month >= 9 && month <=11) System.out.println("Fall");
        else if(month == 12) System.out.println("Winter");
        else System.out.println("This is not month!");

        switch(month){
            case 3: case 4: case 5:
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Fall");
                break;
            case 12: case 1: case 2:
                System.out.println("Winter");
                break;
            default:
                System.out.println("This is not month!");
        }
    }
}

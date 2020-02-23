package assignment;

import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        int itemPrice;
        int quarters, dimes, nickels;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter price in cents:");
        itemPrice=in.nextInt();
        if(itemPrice>=25 && itemPrice<=100 && ((itemPrice%5)==0)){
            itemPrice=100-itemPrice;
            System.out.println("itemPrice = " + itemPrice);
            quarters=itemPrice/25;
            System.out.println("quarters = " + quarters);
            dimes=(itemPrice%25)/10;
            //dimes=itemPrice/10;
            System.out.println("itemPrice%25 = " + itemPrice%25);
            System.out.println("dimes = " + dimes);

            nickels=((itemPrice%25)%10)/5;
            //nickels=itemPrice/5;
            System.out.println("(itemPrice%25)%10) = " + (itemPrice%25)%10);
            System.out.println("nickels = " + nickels);
            System.out.println();
            System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");

        }else{
            System.out.println("Invalid price!");
        }
    }
}

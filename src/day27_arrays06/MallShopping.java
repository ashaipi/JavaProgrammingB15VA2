package day27_arrays06;

public class MallShopping {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 11 case"};
        double[] prices = {99.99, 150, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        // Task 1. Check if all 3 arrays are exact same length
        if (items.length == prices.length && prices.length == itemIDs.length)
            System.out.println("All arrays are equal length");
        else{System.out.println("ERROE: Array length mismatch! Quitting the program"); return;}

        double totalPrice=0.;
        for (int i = 0; i <items.length ; i++) {
            System.out.printf("%6d - %-15s - %4.2f\n",itemIDs[i],items[i],prices[i]);
            totalPrice+=prices[i];
        }
        System.out.printf("\nTotal price: %.2f\n",totalPrice);
        System.out.printf("TAX:         %.2f\n",(totalPrice*0.06));
        System.out.printf("-----------------------\n");
        totalPrice=(totalPrice*0.06)+totalPrice;
        System.out.printf("Total price: %.2f (include tax)\n",totalPrice);

        System.out.println("-----------------------");
        // Task 4. Find AirPods and print along with price and itemID
        for (int i = 0; i <items.length ; i++)
            if(items[i].equals("AirPods")) {
            System.out.printf("%-15s -> Item ID: %6d, Price: %4.2f\n",items[i], itemIDs[i], prices[i]);
            break;
            }

        System.out.println("-----------------------");
        double maxPrice = 0.;
        int maxPriceIndex=0;
        for (int i = 0; i <items.length ; i++)
            if(maxPrice < prices[i]) {maxPrice=prices[i]; maxPriceIndex=i;};
        System.out.printf("%-15s -> Item ID: %6d, Price: %4.2f\n",items[maxPriceIndex], itemIDs[maxPriceIndex], prices[maxPriceIndex]);
        System.out.println("Large Price: "+maxPrice);
    }
}

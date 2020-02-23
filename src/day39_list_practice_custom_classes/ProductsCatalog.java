package day39_list_practice_custom_classes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductsCatalog {
    public static void main(String[] args) {
        //List<String> items = Arrays.asList("iPhone 6s", "iPhone 6s Plus", "iPhone X", "MacBook Pro", "ThumbDrive", "Beats HeadPhones", "Mouse", "Charger", "iPad", "Dyson Vacuum", "TV", "Apple Watch");
        ArrayList<String> items = new ArrayList<>(Arrays.asList("iPhone 6s", "iPhone 6s Plus", "iPhone X", "MacBook Pro", "ThumbDrive", "Beats HeadPhones", "Mouse", "Charger", "iPad", "Dyson Vacuum", "TV", "Apple Watch"));

        ArrayList<Double> price = new ArrayList<>(Arrays.asList(449., 549., 1149., 1499.99, 39.99, 349.99, 79.99, 39.99, 429., 399., 2199., 559.));
        ArrayList<Double> monthlyPayments = new ArrayList<>(Arrays.asList(18.71, 22.88, 56.16, 79.49, 2.68, 15.12, 8.98, 4.56, 18.31, 16.25, 89.49, 21.18));

        System.out.println(items);
        System.out.println(price);
        System.out.println(monthlyPayments);
        for (int i = 0; i < items.size(); i++)
            System.out.println((i+1)+". ["+items.get(i)+" - "+price.get(i)+" - "+monthlyPayments.get(i)+"]");

        ArrayList<String> wholeCatalog = new ArrayList<>();
        for (int i = 0; i < items.size(); i++)
            wholeCatalog.add("["+items.get(i)+" - "+price.get(i)+" - "+monthlyPayments.get(i)+"]");

        for(String c : wholeCatalog) System.out.println(c);
        System.out.println("-----------------------------------");

        String lookingForItem = "Dyson Vacuum";
        boolean b = false;
        for (int i = 0; i < items.size(); i++)
            if(items.get(i).equals(lookingForItem)) {
                System.out.println("[" + items.get(i) + " - " + price.get(i) + " - " + monthlyPayments.get(i) + "]");
                b = true;
            }
            if(!b) System.out.println(lookingForItem+" is not found! keep coding java!");
        System.out.println("-----------------------------------");

        lookingForItem = "Dyson Vacuum";
        if(items.contains(lookingForItem)) {
            int i = items.indexOf(lookingForItem);
            System.out.println("[" + items.get(i) + " - " + price.get(i) + " - " + monthlyPayments.get(i) + "]");
        } else System.out.println(lookingForItem+" is not found! keep coding java!");
        System.out.println("-----------------------------------");

        lookingForItem="TV";
        double newPrice=1099.0;
        if(items.contains(lookingForItem)) {
            int i = items.indexOf(lookingForItem);
            System.out.println("Price updated successfully: form "+price.get(i)+" to "+newPrice);
            System.out.println("new monthly payment: form "+monthlyPayments.get(i)+" to "+newPrice/24);

            price.set(i,newPrice);
            monthlyPayments.set(i,newPrice/24);
            System.out.println("[" + items.get(i) + " - " + price.get(i) + " - " + monthlyPayments.get(i) + "]");
        } else System.out.println(lookingForItem+" is not found! keep coding java!");

        System.out.println("-----------------------------------");

        String deleteItem="ThumbDrive";
        if(items.contains(deleteItem)) {
            int idx = items.indexOf(deleteItem);
            System.out.println(deleteItem+" found in index "+idx);
            items.remove(idx);
            price.remove(idx);
            monthlyPayments.remove(idx);
            System.out.println(deleteItem+" deleted successfully");
        } else System.out.println(deleteItem+" is not found! keep coding java!");

        System.out.println("Task 6-----------------------------------");
        for (int i = 0; i < items.size(); i++)
            if(items.get(i).toLowerCase().contains("iphone"))
                System.out.println("["+items.get(i)+" - "+price.get(i)+" - "+monthlyPayments.get(i)+"]");

        System.out.println("Task 8 remove all phones-----------------");
        for (int i = 0; i < items.size(); i++)
            if(items.get(i).toLowerCase().contains("iphone")){
                items.remove(i);
                price.remove(i);
                monthlyPayments.remove(i);
                i--;
            }
        System.out.println(items);

        System.out.println("Task 7- if price less than 500-----------");
        for (int i = 0; i < items.size(); i++)
            if(price.get(i)<500)
                System.out.println("["+items.get(i)+" - "+price.get(i)+" - "+monthlyPayments.get(i)+"]");

        System.out.println("Task 8- find the most expensive item------");
        int max=0;
        for (int i = 0; i < items.size(); i++)
            if(price.get(max) < price.get(i)) max=i;
        System.out.println("["+items.get(max)+" - "+price.get(max)+" - "+monthlyPayments.get(max)+"]");

        System.out.println("Task 9- find the cheapest item-----------");
        int min = 0;
        for (int i = 0; i < items.size(); i++)
            if(price.get(min) > price.get(i)) min=i;
        System.out.println("["+items.get(min)+" - "+price.get(min)+" - "+monthlyPayments.get(min)+"]");

    }
}

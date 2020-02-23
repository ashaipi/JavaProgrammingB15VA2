package day37_arraylist;
import assignment.Array;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        System.out.println("isEmpty: "+shoppingList.isEmpty());
        if(shoppingList.isEmpty()) System.out.println("List is empty, nothing to buy.");
        else System.out.println("List is not empty");
        shoppingList.add("Apple Laptop");
        shoppingList.add("Tesla");
        shoppingList.add("Sport shoes");
        shoppingList.add("T-shirt");
        shoppingList.add("Jacket");
        shoppingList.add("Hat");
        shoppingList.add("Wooden spoon");
        if(shoppingList.isEmpty()) System.out.println("List is empty, nothing to buy.");
        else System.out.println("List is not empty");

        System.out.println(shoppingList);

        System.out.println("list.contain(jacket): "+shoppingList.contains("Jacket"));
        System.out.println("Index of Jacket: "+shoppingList.indexOf("Jacket"));
        System.out.println("Index of Books: "+shoppingList.indexOf("Books"));

        shoppingList.clear();
        System.out.println(shoppingList);
        System.out.println("isEmpty: "+shoppingList.isEmpty());


    }
}

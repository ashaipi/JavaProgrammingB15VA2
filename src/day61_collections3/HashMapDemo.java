package day61_collections3;
import java.util.*;
import java.util.function.DoubleToIntFunction;

public class HashMapDemo {
    public static void main(String[] args) {
        //   Key  , Value
        Map<String, Double> items = new HashMap<>();
        items.put("eggs",4.45);
        items.put("strawberries", 7.99);
        items.put("potatoes", 7.0);
        items.put("cat food", 18.0);
        items.put("milk", 3.99);
        items.put("cookies", 3.49);
        items.put("cookies", 3.0);

        System.out.println(items.toString());
        System.out.println("Size: "+items.size());

        System.out.println("-----------------------");
        System.out.println("Price of eggs: "+items.get("eggs"));
        System.out.println("Price of strawberries: "+items.get("strawberries"));
        System.out.println("Price of potatoes: "+items.get("potatoes"));
        System.out.println("Price of cat food: "+items.get("cat food"));
        System.out.println("Price of milk: "+items.get("milk"));
        System.out.println("Price of cookies: "+items.get("cookies"));

        System.out.println("-----------------------");
        System.out.println(items.keySet());
        System.out.println(items.values());

        for(String key : items.keySet()) {
            System.out.printf("Key: %-15s",key);
            System.out.println("Value: "+items.get(key));
        }

        System.out.println(items.containsKey("eggs"));

    }
}

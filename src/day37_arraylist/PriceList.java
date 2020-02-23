package day37_arraylist;
import java.util.*;

public class PriceList {
    public static void main(String[] args) {
        List<Double> prices = new ArrayList(Arrays.asList(9.99, 5.44, 10.99, 2.49, 299.49, 57.5, 123.45));
        System.out.println("prices = " + prices);
        double totalPrices = 0.;
        for (double p : prices) totalPrices += p;
        System.out.println("totalPrices = " + totalPrices);

        double sum = 0.;
        for (int i = 0; i < prices.size(); i++) sum += prices.get(i);
        System.out.println("sum = " + sum);

        // declare double array list name it cheap
        List<Double> cheap = new ArrayList<>();

        // add all the prices that are less than 20 to cheap array list
        for (double p : prices) if (p < 20) cheap.add(p);
        System.out.println("cheap = " + cheap);

        // declare double array list name it expensive
        List<Double> expensive = new ArrayList<>();

        // add all the prices that are less than 20 to expensive array list
        for (double p : prices) if (p > 20) expensive.add(p);
        System.out.println("expensive = " + expensive);
    }
}

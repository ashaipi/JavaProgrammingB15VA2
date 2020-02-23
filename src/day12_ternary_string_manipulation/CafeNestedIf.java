package day12_ternary_string_manipulation;

public class CafeNestedIf {
    public static void main(String[] args) {
        String order="food", drink="soda", food="soup";
        double price=0.0;
        // order -> drink, food
        // drink -> soda 1.99, coffee 4.99, water 1.55
        // food  -> sandwich 7.45, soup 6.33, salad 9.99
        // Total price:
        if(order.equals("drink")){
            if(drink.equals("soda"))        price=1.99;
            else if(drink.equals("coffee")) price=4.99;
            else if(drink.equals("water"))  price=1.55;
            else System.out.println("Sorry, no such drink available");
        }else if(order.equals("food")){
            if(food.equals("sandwich"))     price=7.45;
            else if(food.equals("soup"))    price=6.33;
            else if(food.equals("salad"))   price=9.99;
            else System.out.println("Sorry, no such food available");
        }

        System.out.println("Total price: "+price);
    }
}

package day44_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Starbucks {
    public static void drinkCoffee(Coffee coffeeObj){
        System.out.println("Drinking "+coffeeObj.getName()+" and coding java");
    }

    public static Coffee orderCoffee(String coffeeName, String coffeeSize){
        System.out.println("Preparing "+coffeeSize+" "+coffeeName);
        Coffee readyCoffee = new Coffee(coffeeName,coffeeSize,0.99);
        return readyCoffee;
    }

    public static void main(String[] args) {
        Coffee cappuccino = new Coffee("cappuccino", "grande", 3.99);
        cappuccino.drink();
        System.out.println(cappuccino.toString());

        Coffee[] coffeeArray = new Coffee[2];
        coffeeArray[0] = cappuccino;
        coffeeArray[1] = new Coffee("Latte", "venti", 5.99);
        System.out.println(Arrays.toString(coffeeArray));

        List<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(cappuccino);
        coffeeList.add(coffeeArray[1]);
        coffeeList.add(new Coffee("Nitro Brew", "tall", 3.49));
        System.out.println(coffeeList.toString());

        coffeeList.forEach(n -> System.out.println(n));

        System.out.println("--- CALL CUSTOM METHOD - DRINKCOFFEE ---");
        Coffee hotChocolate = new Coffee("Hot Chocolate", "venti", 4.99);
        drinkCoffee(hotChocolate);
        drinkCoffee(cappuccino);

        System.out.println("--- CALL ORDERCOFFEE METHOD ---");
        System.out.println(orderCoffee("White Mocha", "grande").getName());
        Coffee myCoffee = orderCoffee("White Mocha", "grande");
        myCoffee.drink();
        System.out.println(myCoffee);

        Coffee myVanillaLatte = orderCoffee("Vanilla Latte", "venti");
        myVanillaLatte.drink();
    }
}

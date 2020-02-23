package day14_string_manipulation;

import org.w3c.dom.ls.LSOutput;

public class StringContains {
    public static void main(String[] args) {
        String email = "student@gmail.com";
        System.out.println(email.contains("@"));
        System.out.println(email.contains("#"));

        String list = "milk, eggs, bread, turkey, water, chocolate, potatoes, apples";
        if(list.contains("turkey")) System.out.println("Turkey is there");
        else System.out.println("We forgot turkey");

        if(list.contains("bananas")) System.out.println("Bananas is there");
        else System.out.println("We forgot Bananas");
        
        boolean hasMilk = list.contains("milk");
        System.out.println("hasMilk = " + hasMilk);
        
        boolean hasWater = list.toUpperCase().contains("WATER");
        System.out.println("hasWater = " + hasWater);


    }
}

package day35_wrapper_classes;

import java.util.Arrays;

public class Cooking {
    public static void main(String[] args) {
        scrambledEggsRecipe();
        pastaRecipe();
    }
    public static void pastaRecipe(){
        System.out.println("~~~ Delicious pasta recipe ~~~");
        add("water");
        boil(1);
        add("salt", "spaghetti", "olive oil");
        boil(10);
        System.out.println("Pick up wooden spoon");
        mix(100);
        add("tomato sauce");
        System.out.println("~~~ Ready - drain water and enjoy ~~~");
    }
    public static void scrambledEggsRecipe(){
        System.out.println("~~~ Scrambled eggs recipe ~~~");
        add("oil","eggs","salt","cheese");
        mix(10);
        fry(3);
        System.out.println("~~~ Enjoy your Scrambled eggs ~~~");
    }
    public static void add(String... item){
        System.out.println("Adding: "+ Arrays.toString(item));
    }
    public static void mix(int seconds){
        System.out.println("Mix for "+seconds+" seconds ");
    }
    public static void boil(int minutes){
        System.out.println("Boil for "+minutes+" minutes");
    }
    public static void fry(int minutes){
        System.out.println("Fry for "+minutes+" minutes");
    }
    public static void bake(int minutes){
        System.out.println("Bake for "+minutes+" minutes");
    }
}

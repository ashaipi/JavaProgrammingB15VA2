package assignment;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListReview {
    public static void main(String[] args) {


        /*
        Character.isDigit() -> return Boolean
        Character.isLetter()
        Character.isUpperCase()
        Character.isLowerCase()
        Character.isAlphabetic()
        Character.isLetterOrDigit()

        Integer.parsInt("String number") -> return int
        Integer.valueOf("String number") -> return Integer
        Integer.valueOf(int) - return Integer

        .size() -> return int
        .add(element) -> adds item/object/element to ArrayList
        .get(int index) -> it returns item/object from specified index
        .contains(element) -> boolean
        .toString() -> formatted String of the list
        .remove(element) -> void it removes stated element from list
        .remove(int index) -> void it removes an element from stated index
        .removeAll() -> remove all elements from ArrayList
        .clear() -> remove all elements from ArrayList
        .set(int index, element) -> replacing an element at stated index
        .isEmpty() -> return boolean
        Collection.sort(ArrayList) -> sorts the list
        Collection.reverse(ArrayList) - reverse the ArrayList

        Create an ArrayList type String
        add 4 Strings to it
        find the size and print it
        add one more String
        print ArrayList
        remove last element from list
        set 1st element to "Lemon"
        check if "Apple" is in the list
        sort the list
        print list
        reverse list
        print list
         */
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Strawberry");
        fruits.add("Fig");
        System.out.println("fruits = " + fruits);
        System.out.println("fruits.size() = " + fruits.size());
        fruits.add(2,"Apple");
        System.out.println("fruits = " + fruits);

        fruits.remove(fruits.size()-1);
        System.out.println("Remove ["+fruits.remove(fruits.size()-1)+"] from the list");
        System.out.println("fruits = " + fruits);

        fruits.set(0,"Lemon");
        System.out.println("fruits = " + fruits);

        System.out.println("Does list have Apple?: "+fruits.contains("Apple"));

        Collections.sort(fruits);
        System.out.println("fruits = " + fruits);

        Collections.reverse(fruits);
        System.out.println("fruits = " + fruits);

        // Switch 2nd and last elements in ArrayList
        String temp = fruits.get(1);
        fruits.set(1,fruits.get(fruits.size()-1));
        fruits.set(fruits.size()-1,temp);
        System.out.println("fruits = " + fruits);




        //System.out.println(Character.isAlphabetic(65));
    }
}

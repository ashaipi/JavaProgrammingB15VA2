package day59_exceptions_collection1.collection;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Declaring and Instantiation of ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Collection<Integer> list3 = new ArrayList<>();
        Iterable<Integer> list4 = new ArrayList<>();

        list1.add(23);
        list1.add(453);
        list1.add(123);
        list1.add(543);
        list1.add(543);
        System.out.println("list1.toString() = " + list1.toString());

    }
}

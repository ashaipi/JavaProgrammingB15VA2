package day59_exceptions_collection1.collection;
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        List<String> linkedList2 = new LinkedList<>();

        linkedList.add("java");
        linkedList.add("python");
        linkedList.add("C#");
        linkedList.add("C++");
        linkedList.addFirst("html");
        linkedList.addLast("JavaScript");

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.toString());
        System.out.println("Size: "+linkedList.size());

        for(String l : linkedList) System.out.println(l);
    }
}

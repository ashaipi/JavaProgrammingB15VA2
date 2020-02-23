package day36_wapper_arraylist;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        // Declare ArrayList
        ArrayList myFirstList = new ArrayList();
        // assign value using add method
        myFirstList.add("java");
        myFirstList.add("javascript");
        myFirstList.add("python");
        myFirstList.add("Repl.it");
        myFirstList.add(1200);
        myFirstList.add(34.5);
        myFirstList.add(true);

        System.out.println(myFirstList);
        ArrayList<Integer> numsList = new ArrayList<>();
        numsList.add(100);
        numsList.add(200);
        numsList.add(300);
        System.out.println(numsList.toString());


    }
}

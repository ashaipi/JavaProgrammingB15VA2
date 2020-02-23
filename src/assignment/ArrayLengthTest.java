package assignment;

import java.util.ArrayList;

public class ArrayLengthTest {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        String[] items = { "One", "Two", "Three" };
        for (String str : items) {
            arrList.add(str);
        }
        int size = items.length;
        System.out.println(size);
    }
}

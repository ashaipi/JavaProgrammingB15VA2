package day31_multidarrays_methods;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class TowDArray {
    public static void main(String[] args) {
        String[][] list = new String[4][3];
        list[0][0] = "Potatoes"; list[0][1] = "Carrots"; list[0][2] = "Onions";
        list[1][0] = "Apples";   list[1][1] = "Kiwi";    list[1][2] = "Figs";
        list[2][0] = "Milk";     list[2][1] = "Eggs";    list[2][2] = "Cheese";
        list[3][0] = "Bread";    list[3][1] = "Bagel";   list[3][2] = "Muffin";

        System.out.println("Rows:   "+list.length);
        System.out.println("column: "+list[0].length);
        for (int i = 0; i < list.length ; i++) System.out.println(Arrays.toString(list[i]));

        System.out.println();
        for (int i = 0; i <list.length ; i++) {
            for (String l : list[i]) System.out.printf("%-10s", l);
            System.out.println();
        }
        System.out.println("\n"+Arrays.deepToString(list));

        String[] fruits = list[1];
        System.out.println(Arrays.toString(fruits));
    }
}

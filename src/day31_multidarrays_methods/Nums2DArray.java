package day31_multidarrays_methods;

import java.util.Arrays;

public class Nums2DArray {
    public static void main(String[] args) {
        int[][] nums2D = {{12,  55,  4,   7},
                          {123, 555, 9},
                          {56,  87,  455, 34},
                          {234, 12,  54,  23, 23}};

        // print length of each 1d array using loop
        for(int[] n : nums2D) System.out.println("ROW length: "+n.length);
        for (int i = 0; i <nums2D.length ; i++) System.out.println("Row("+i+"): "+nums2D[i].length+" array length");

        for (int[] n : nums2D) Arrays.sort(n);
        System.out.println(Arrays.deepToString(nums2D));

        for (int row = 0; row <nums2D.length ; row++) {
            for (int column = 0; column <nums2D[row].length; column++)
                System.out.printf("%7d",nums2D[row][column]);
            System.out.println();
        }
        System.out.println();

        for (int[] eachRow : nums2D) {
            for (int eachColumn : eachRow) System.out.printf("%7d",eachColumn);
            System.out.println();
        }

        int sum=0;
        for (int[] eachRow : nums2D) for (int n : eachRow) sum+=n;

        System.out.println("sum = " + sum);




    }
}

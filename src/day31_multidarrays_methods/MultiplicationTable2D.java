package day31_multidarrays_methods;

public class MultiplicationTable2D {
    public static void main(String[] args) {
        int[][] table = new int[10][10];

        for (int i = 1; i <= table.length; i++) {
            for (int j = 1; j <= table.length; j++) System.out.printf("%4d  %c",i*j,65512);
            System.out.printf("\n");
        }

    }
}

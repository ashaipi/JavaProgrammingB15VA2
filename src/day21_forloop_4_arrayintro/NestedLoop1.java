package day21_forloop_4_arrayintro;
import java.lang.*;

public class NestedLoop1 {
    public static void main(String[] args) {

        for (int j = 0; j < 5 ; j++){
            for (int i = 5; i > j; i--)    System.out.print("  ");
            for (int i = j; i >= -j ; i--) System.out.print(Math.abs(i)+" ");
            System.out.println();
        }

        for (int j = 0; j < 5 ; j++){
            for (int i = 5; i > j; i--)    System.out.print("  ");
            for (int i = j; i >= -j ; i--) System.out.print(Math.abs(i)+" ");
            System.out.println();
        }

        for (int outer = 0; outer <=5 ; outer++) {
            for (int i = 5; i > outer; i--)    System.out.print("  ");
            for (int inner = outer; inner >= 1; inner--)  System.out.printf("%d ",inner);
            for (int inner = 0; inner <= outer; inner++)  System.out.printf("%d ",inner);
            System.out.println();
        }

        for (int outer = 4; outer >=0 ; outer--) {
            for (int i = 5; i > outer; i--)    System.out.print("  ");
            for (int inner = outer; inner >= 1; inner--)  System.out.printf("%d ",inner);
            for (int inner = 0; inner <= outer; inner++)  System.out.printf("%d ",inner);
            System.out.println();
        }

        for (int i = 1, j=10; i <= 10 ; i++, j--) System.out.println(i+"   "+j);


    }
}

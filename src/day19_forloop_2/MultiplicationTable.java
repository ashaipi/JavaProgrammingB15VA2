package day19_forloop_2;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d x 1 = %2d - %2d x 2 = %2d - %2d x 3 = %2d - %2d x 4 = %2d  - %2d x 5 = %2d\n"
                    , i, i, i, (i * 2), i, (i * 3), i, (i * 4), i, (i * 5));
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d x 6 = %2d - %2d x 7 = %2d - %2d x 8 = %2d - %2d x 9 = %2d  - %2d x 10 = %2d\n"
                    , i, (i * 6), i, (i * 7), i, (i * 8), i, (i * 9), i, (i * 10));
        }
    }
}

package day21_forloop_4_arrayintro;

public class Multiplication {
    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 5 ; j++) System.out.printf("%2d x %2d = %2d  |  ",i,j,i*j);
                                        //System.out.print(i+" x "+j+" = "+(i*j)+"    ");
            System.out.println();
        }
    }
}

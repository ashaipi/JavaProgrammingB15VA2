package day21_forloop_4_arrayintro;

public class PrintStarsColRow {
    public static void main(String[] args) {
        int rows =4;
        int column = 6;
        //for(char i='z' ; i>='v' ; i--) for(char j='z' ; j>='v'; j--) System.out.println(i+""+j);
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= column ; j++)    System.out.print("\u2605"+"  ");
            for (int j = 1; j <= column+10 ; j++) System.out.print("\u2B1B");
            System.out.println();
            for (int j = 1; j <= column-1 ; j++)  System.out.print("  "+"\u2605");
            System.out.println();
        }
        for (int j = 1; j <= column+23 ; j++)     System.out.print("\u2B1B");
    }
}

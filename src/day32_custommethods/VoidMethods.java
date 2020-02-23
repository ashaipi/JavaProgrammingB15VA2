package day32_custommethods;

public class VoidMethods {
    public static void countFrom1to10(){
        for (int i = 1; i <= 10 ; i++) System.out.print(i+" ");
        System.out.println();
    }

    public static void printAtoZ(){
        for (char i = 'A'; i <= 'Z'; i++) System.out.print(i+ " ");
        System.out.println();

    }
    public static void iCanDoIt(){
        for (int i = 0; i < 300 ; i++)
            System.out.print("Java is Fun - I can do it! | ");
        System.out.println();
    }
    public static void displayUSFlag(){
        String p1 = "\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 ==================================\n \u2605 \u2605 \u2605 \u2605 \u2605  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }




    public static void main(String[] args) {
        countFrom1to10();
        printAtoZ();
        iCanDoIt();
        displayUSFlag();

    }
}

package day03_primitives_mathoperators;

public class EscapeSequence {
    public static void main(String[] args){
        Double a=23.126, b=12.12345;
        byte i = 127, ii = -128;
        char c = 'A';
        boolean boo = true;

        System.out.println("Hello\t\tB15");
        System.out.println("I love \"Java\" programming");
        System.out.println("Lets buy \"coffee\" and \"tea\"");
        System.out.println("Java\nSelenium");
        System.out.println("\" _ \"");
        System.out.println("\"/ \\\"");
        System.out.println("\"\\_/\"");
        System.out.printf("A=%.2f and B=%.2f = %.2f\n",a,b,a+b);

        System.out.println(i+" "+ii+" "+c+" "+!boo);


    }
}

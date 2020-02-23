package day04_math_operators_scanner;

public class MathOperations {
    public static void main(String[] args){
        //  a+b         c+a
        // _________ - _______
        //    2          4
        int a=10,b=1,c=10,d=10,e1,e2;
        e1=(a+b)/3-(c+a)/4;
        e2=((a+b)/3)-((c+a)/4);
        System.out.println(e1+"     "+e2);
        System.out.println(10/3.);
    }
}

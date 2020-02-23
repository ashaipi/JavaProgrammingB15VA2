package day03_primitives_mathoperators;

public class UsingVariables {
    public static void main(String[] args){
        int i=100,j;
        double d=23.5,u;
        //j=d;  can not change value from double to integer - ERROR
        u=i;    // it is Ok to change value or from integer to double
        System.out.println(i+d);
        int num1, num2, num3;
        num1 = 100;
        num2 = num1;
        num3 = num2;
        System.out.println(num1+" "+num2+" "+num3);
        num2 = 500;

        System.out.println(num1+" "+num2+" "+num3);

    }
}

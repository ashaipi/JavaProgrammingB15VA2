package day12_ternary_string_manipulation;

import java.util.function.DoubleToIntFunction;

public class AmazonNestedIf {
    public static void main(String[] args) {
        boolean isPrimeMember = true;
        double totalOrderPrice = 23.45;

        if(isPrimeMember)           System.out.println("Eligible for free shipping");
        else{
            if(totalOrderPrice>25)  System.out.println("Eligible for free shipping");
            else                    System.out.println("Not Eligible for free shipping");
        }
        /*
        int x = 1,j=0;
        x= x>10?20:(j=x>10?11:2);
        System.out.println(x+" "+j);
         */
    }
}

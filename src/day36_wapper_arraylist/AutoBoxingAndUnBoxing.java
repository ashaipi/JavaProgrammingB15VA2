package day36_wapper_arraylist;

public class AutoBoxingAndUnBoxing {
    public static void main(String[] args) {
        // AutoBoxing: Primitive > Wrapper class object
        Integer n1 = 1000;
        int n = 345;
        Integer n2 = n;

        // UnBoxing: Wrapper class object > Primitive
        Integer n3 = Integer.valueOf(4567);
        int num1 = n3;

        //Print values
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("num1 = " + num1);
    }
}

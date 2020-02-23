package day35_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer num1 = new Integer(10);
        Integer num2 = 33;

        System.out.println("num2 = " + num1);
        System.out.println("num2 = " + num2);

        String str = num1.toString(); // convert int to String

        // Integer Class static methods
        System.out.println(Integer.sum(20,30));
        System.out.println(Integer.max(3,67));
        System.out.println(Integer.min(4,65));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.compare(5,5));
    }
}

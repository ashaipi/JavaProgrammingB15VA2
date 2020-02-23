package day36_wapper_arraylist;

public class CastingWithWrappers {
    public static void main(String[] args) {
        // Casting primitives
        int intValue = 123;
        double doubleValue = intValue; //implicit(automatic) casting

        System.out.println("intValue = " + intValue);
        System.out.println("doubleValue = " + doubleValue);

        Integer wrapperInt = Integer.valueOf(100);
        //Double wrapperDouble = wrapperInt; // ERROR: cannot cast amoung wrappers
        Double wrapperDouble = (double) wrapperInt; // unboxing>casting>autoboxing

        System.out.println("wrapperInt = " + wrapperInt);
        System.out.println("wrapperDouble = " + wrapperDouble);

    }
}

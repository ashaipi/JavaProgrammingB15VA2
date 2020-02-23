package day36_wapper_arraylist;

public class CovertStringToPrimitive {
    public static void main(String[] args) {
        boolean b1 = Boolean.parseBoolean("true");
        char ch = "a".charAt(0);
        byte byteValue = Byte.parseByte("100");
        short shortValue = Short.parseShort("10000");
        int intValue = Integer.parseInt("7658676");
        long longValue = Long.parseLong("12398098798787987");
        float floatValue = Float.parseFloat("32114324.656");
        double doubleValue = Double.parseDouble("1231223234132423.23");

        System.out.println("b1 = " + b1);
        System.out.println("ch = " + ch);
        System.out.println("byteValue = " + byteValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);

    }
}

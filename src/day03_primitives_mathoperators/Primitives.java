package day03_primitives_mathoperators;

public class Primitives {
    public static void main(String[] args){
        byte   byteValue   = 35;
        short  shortValue  = 10000;
        int    intValue    = 1000000000;
        long   longValue   = 1000000000000000000l;
        float  floatValue  = 1000000000.111111111111111111111111111111111f;
        double doubleValue = 100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.999d;
        char   charValue   = '\'';
        boolean booleanValue = true;

        System.out.println("byte   "+byteValue);
        System.out.println("short  "+shortValue);
        System.out.println("int    "+intValue);
        System.out.println("long   "+longValue);
        System.out.println("float  "+floatValue);
        System.out.println("double "+doubleValue);
        System.out.println("char   "+charValue);
        System.out.println("boolean     "+booleanValue);
        System.out.println("not boolean "+!booleanValue);
        charValue='A';
        System.out.println((int)charValue);
        intValue=65;
        System.out.println((char)intValue);
    }
}

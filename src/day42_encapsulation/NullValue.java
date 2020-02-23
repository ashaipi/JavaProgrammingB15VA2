package day42_encapsulation;

public class NullValue {
    static String str;
    static int num;
    static boolean isTrue;
    static char c;

    public static void main(String[] args) {
        String myString = null;
        System.out.println("myString = " + myString);
        System.out.println("str = " + str);       // null
        System.out.println("num = " + num);       // 0
        System.out.println("isTrue = " + isTrue); // false
        System.out.println("c = " + c);           // ''
        System.out.println(myString.length());    // NullPointerException
    }
}

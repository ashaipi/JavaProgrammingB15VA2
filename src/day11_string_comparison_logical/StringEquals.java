package day11_string_comparison_logical;

import javax.sound.midi.Soundbank;

public class StringEquals {
    public static void main(String[] args) {

        String str = "java";
        String str2 = new String("java");

        //Compare using
        System.out.println(str == "java");  //true
        System.out.println(str2 == "java"); //false
        System.out.println(str == str2);    //false

        //Compare using (.equals()) method
        System.out.println(str.equals("java"));  //true
        System.out.println(str2.equals("java")); //true
        System.out.println(str2.equals("Java")); //false
        System.out.println(str.equals(str2));    //false

        //Compare using (.equalsIgnoreCase()) method
        System.out.println(str.equalsIgnoreCase("java"));  //true
        System.out.println(str2.equalsIgnoreCase("java")); //true
        System.out.println(str2.equalsIgnoreCase("JAVA")); //true
        System.out.println(str.equalsIgnoreCase(str2)); //true

    }
}

package day15_string_manipulation;

public class SubString {
    public static void main(String[] args) {
        //             01234567890
        String word = "java is fun";
        System.out.println(word.substring(0,4));
        System.out.println(word.substring(5,7));
        System.out.println(word.substring(8,11));

        System.out.println(word.substring(8));
    }
}

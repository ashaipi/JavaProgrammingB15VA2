package day13_string_manipulation;

public class StringCaseConv2 {
    public static void main(String[] args) {
        String word = "Cybertek School";
        System.out.println("word = " + word);

        // Print the word in all uppercase
        System.out.println("word = " + word.toUpperCase());

        // Print the word in all lowercase
        word = word.toUpperCase();
        System.out.println("word = " + word.toLowerCase());

        if(word.equals(word.toLowerCase())) System.out.println("all letters is lowercase");
        else System.out.println("some or all letters uppercase");


    }
}

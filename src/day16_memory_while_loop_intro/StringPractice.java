package day16_memory_while_loop_intro;

import java.sql.SQLOutput;

public class StringPractice {
    public static void main(String[] args) {
        String word = "jav"; // always 3 characters
        String reversed = ""; // vaj
        /*
        Read third letter from word and concatenate to reversed
        Read second letter from word and concatenate to reversed
        Read first letter from word and concatenate to reversed
         */

        System.out.println(word);
        reversed = ""+word.charAt(2)+word.charAt(1)+word.charAt(0);
        System.out.println(reversed);

        System.out.println(word.equals(reversed));

        if(word.equals(reversed)) System.out.println("Palindrome 3 letter word");
        else System.out.println("Non-Palindrome 3 letter word");
    }
}

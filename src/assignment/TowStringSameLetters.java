package assignment;

import day24_arrays03.ArraysSort;

import java.util.*;

public class TowStringSameLetters {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        String word1="", word2="";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        for(char c : ch1) word1+=c;
        Arrays.sort(ch2);
        for(char c : ch2) word2+=c;

        if(word1.equals(word2))
            System.out.println("the word ["+str1+"] has same letters as word ["+str2+"]");
        else System.out.println("They has different litters");

    }
}

package day20_forloop_3;

public class Palindrome {
    public static void main(String[] args) {
        String firstWord = "Race car", reversed ="";
        String word=firstWord.toLowerCase().replace(" ","");

        for (int i = word.length()-1; i >= 0 ; i--) reversed+=word.charAt(i);

        if(word.equals(reversed)) System.out.println("["+firstWord+"] is Palindrome");
        else System.out.println("["+firstWord+"] is not Palindrome");
    }
}

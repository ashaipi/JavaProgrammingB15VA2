package day25_arrays04_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("words.length = " + words.length);

        for (int i = 0; i < words.length ; i++) System.out.print(words[i]+" ");
        System.out.println();

        String reversed = "";
        for (int i = words.length-1; i >= 0 ; i--) reversed+=words[i]+" ";
        System.out.println("reversed = "+reversed.trim());

    }
}

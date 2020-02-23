package day27_arrays06;
import java.util.*;

public class Encryption {
    public static void main(String[] args) {
                        //           1         2
                        // 0123456789012345678901234567
        String alphabet = "abcdefghijklmnopqrstuvwxyz ";
        String encrypted ="zyxwvutsrqponmlkjihgfedcba ";

        String w = "java";
        String encWord = "";
        encWord+=encrypted.charAt(alphabet.indexOf(w.charAt(0)));
        encWord+=encrypted.charAt(alphabet.indexOf(w.charAt(1)));
        encWord+=encrypted.charAt(alphabet.indexOf(w.charAt(2)));
        encWord+=encrypted.charAt(alphabet.indexOf(w.charAt(3)));
        System.out.println("encWord = " + encWord);

        String word = "java is fun";
        System.out.println("word:            " + word);
        String encryptedWord ="";
        for (int i = 0; i < word.length() ; i++)
            encryptedWord+=encrypted.charAt(alphabet.indexOf(word.charAt(i)));
        System.out.println("Encrypted words: "+encryptedWord);

        // task 3. declare word and assing some encrypted message
        // decrypt it!
        encryptedWord="dliow";
        String newWord="";
        for (int i = 0; i < encryptedWord.length() ; i++)
            newWord+=alphabet.charAt(encrypted.indexOf(encryptedWord.charAt(i)));
        System.out.println("Decrypted words: "+newWord);

    }
}

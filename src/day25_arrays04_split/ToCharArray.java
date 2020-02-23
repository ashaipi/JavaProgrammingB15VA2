package day25_arrays04_split;

import java.util.Arrays;

public class ToCharArray {
    public static void main(String[] args) {
        String word = "java";
        char[] letters = word.toCharArray();

        System.out.println("Letters length: "+letters.length);
        for(char c : letters) System.out.println(c);

        //sort letters array
        Arrays.sort(letters);

        //print all in same line separated by comma
        System.out.println(Arrays.toString(letters));

        String str ="aosihefniqeonuewrocinsfskjbvkwoix";
        char[] strArray = str.toCharArray();
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));
        
        //after sorting, create a new string with that value of array
        String sortString = new String(strArray);
        System.out.println("sortString = " + sortString);
    }
}

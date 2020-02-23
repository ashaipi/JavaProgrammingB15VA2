package day25_arrays04_split;
import java.util.*;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java,ruby,python,c++";

        // split the words by "," and assign to String[]
        String[] wordsArray = words.split(",");
        System.out.println("Length of wordsArray: "+wordsArray.length);
        System.out.println(Arrays.toString(wordsArray));
        for (int i = wordsArray.length-1 ; i >= 0 ; i--) System.out.print(wordsArray[i]+" ");
        System.out.println();

        String results = "About 117,000,000 results (1.35 seconds)";
        String[] resultsArray = results.split(" ");
        System.out.println(resultsArray[1]);

        // using for each loop print everything in separate lines
        for(String s : resultsArray) System.out.println(s);


    }
}

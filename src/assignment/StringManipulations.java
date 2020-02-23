package assignment;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {

        /*
                enter 2 words - Scanner
                if length of 1st word is > 5:
                    replace 4th index with * in 1st word
                    everything after 4th index -
                        replace w/ 2nd word
                if less than 5:
                    concat first half of 1-st word with
                    2nd half of second word
                    (if not even - take bigger part)
                    Print the result with the first letter uppercase
                    in second case
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word 1 ");
        String word1 = scanner.next();
        System.out.println("Enter word 2 ");
        String word2 = scanner.next();
        /*
                Umbrella -> Umbr*lla
                Umbrellae -> Umbr*lla*
                Umbr + "*" + word2
         */
        int w1Length = word1.length(); //how many chars in String
        if (w1Length >= 5) {
            char char4 = word1.charAt(4);  //get the char at index 4
//            word1 = word1.replace(char4, '*'); //replace(oldChar, replace with new one)
            System.out.println("word 1 " + word1);
//            word1 = word1.replace("eve", "*");
//          word1 = word1.replace(4, '*');
            // indexOf() - return int
            //in replace method we can put only chars
            //in replace -> word1.replace("eve", "*")
            //substring
            word1 = word1.substring(0, 4) + "*" + word2;
            /*
                    substring() - cut
                    substring(startPoint) - cut from start point to the end
                    substring(startIndex, endIndex) - cut from start to end
                        endIndex is not included
             */
            System.out.println("word 1 " + word1);
        } else {
            /*
             pine / 4/2  Floor / 5/2 -> 2
             trees -> 5/2=2
             tree -> 4/2 = 2
             -> piees
             */
            int w1L = word1.length();
            int w2L = word2.length();
            String part1;
            if (w1L % 2 == 0) {
                part1 = word1.substring(0, w1L / 2);
            } else {
                part1 = word1.substring(0, w1L / 2 + 1);
            }
            String part2 = word2.substring(w2L / 2);
//            String result = part1+part2;
            String result = part1.concat(part2);
            /*
                result: pave -> Pave
             */
            //if we + "" to the char it will convert to String
            result = (result.charAt(0) + "").toUpperCase() + result.substring(1);
            System.out.println(result);
        }
    }
}

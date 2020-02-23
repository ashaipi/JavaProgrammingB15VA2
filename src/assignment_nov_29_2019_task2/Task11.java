package assignment_nov_29_2019_task2;

public class Task11 {
    public static void main(String[] args) {
        /*
        Ask user to enter sentence with more than 1 word
        For example I love Java
        write a program to
        print first word and last word
         */

        String sentence = "I love Java";
        sentence=sentence.trim();

        int firstDot=sentence.indexOf(" ")+1;
        int lastDot = sentence.lastIndexOf(" ");

        System.out.print(sentence.substring(0,firstDot)+" "+sentence.substring(lastDot));
    }
}

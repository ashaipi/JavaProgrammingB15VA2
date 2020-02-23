package assignment_nov_29_2019_task2;

public class Task10 {
    public static void main(String[] args) {

        /*
        Ask user to enter sentence with 3 words
        For example I love Java
        write a program to print second word
         */

        String sentence = "I love java";
        sentence=sentence.trim();

        int firstSpace=sentence.indexOf(" ")+1;
        int secondSpace = sentence.indexOf(" ",firstSpace+1);

        System.out.println(sentence.substring(firstSpace,secondSpace));

    }
}

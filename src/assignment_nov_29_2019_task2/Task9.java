package assignment_nov_29_2019_task2;

public class Task9 {
    public static void main(String[] args) {
        /*
        Ask user to enter a valid URL in below format
        www.blackfriday.com
        Write a program to print first Index of .(dot)
        and last index of .(dot)
        and eventually print the domain
        for example :
        www.nightwatch.com  --->> blackfriday
         */

        String sentence = "www.blackfriday.com";
        sentence=sentence.trim();

        int firstDot=sentence.indexOf(".")+1;
        int lastDot = sentence.lastIndexOf(".");

        System.out.println(sentence.substring(firstDot,lastDot));
    }
}

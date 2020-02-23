package assignment_nov_29_2019_task2;

public class Task13 {
    public static void main(String[] args) {
        /*
        Given a String with 3 characters
        swamp first character with last character
        and check whether new String is same as old one
        if so print Palindrome
         */
        String word="MOM", reversed;
        reversed = ""+word.charAt(2)+word.charAt(1)+word.charAt(0);
        System.out.println(reversed);

        if(word.equals(reversed)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}

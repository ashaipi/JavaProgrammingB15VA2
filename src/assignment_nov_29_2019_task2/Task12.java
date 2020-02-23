package assignment_nov_29_2019_task2;

public class Task12 {
    public static void main(String[] args) {
        /*
        Given a String with at least two characters
        swamp first character with last character
        for example
            Java --> aavJ , Kawap --> pawaK
         */
         String str = "Java";
         int firstChar = str.indexOf(str.charAt(0));
         int lastChar = str.length()-1;
         str = str.charAt(lastChar)+str.substring(firstChar+1,lastChar)+str.charAt(firstChar);
         System.out.println(str);
    }
}

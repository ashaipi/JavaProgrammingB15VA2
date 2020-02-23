package day36_wapper_arraylist;

public class CharacterWrapper {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isLetterOrDigit(ch));
        System.out.println(Character.isLowerCase(ch));
        System.out.println(Character.isAlphabetic(ch));
        System.out.println("--------------------");

        ch = '5';
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isLetterOrDigit(ch));
        System.out.println(Character.isLowerCase(ch));
        System.out.println(Character.isAlphabetic(ch));
        System.out.println("--------------------");

        ch = '%';
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isLetterOrDigit(ch));
        System.out.println(Character.isLowerCase(ch));
        System.out.println(Character.isAlphabetic(ch));
        System.out.println(!Character.isLetterOrDigit(ch));
        System.out.println("--------------------");

        ch = ' ';
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isLetterOrDigit(ch));
        System.out.println(Character.isLowerCase(ch));
        System.out.println(Character.isSpaceChar(ch));
        System.out.println(Character.isWhitespace(ch));
        System.out.println("--------------------");

        // test if firstname starts with uppercase letter
        String firstName = "Abubaker";
        System.out.println(Character.isUpperCase(firstName.charAt(0)));
    }
}

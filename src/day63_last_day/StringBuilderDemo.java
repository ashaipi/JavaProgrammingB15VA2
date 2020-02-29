package day63_last_day;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "java";
        str+=",selenium";  // Immutable
        /*
        java
        ,selenium
        java,selenium
         */
        System.out.println("str= "+str);

        StringBuilder std = new StringBuilder("java");
        std.append(",selenium");
        System.out.println(std);

        StringBuffer stdf = new StringBuffer("java");
        stdf.append(",html").append(",git");
        stdf.reverse();
        System.out.println(stdf);

        String checkStr = "civic";
        StringBuilder stBuilder = new StringBuilder(checkStr);
        stBuilder.reverse();
        if(stBuilder.toString().equals(checkStr))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        System.out.println(isPalindrome("mom"));
        System.out.println(isPalindrome("Dad"));
        System.out.println(isPalindrome("nurses run"));
        System.out.println(isPalindrome("race car"));
    }

    public static boolean isPalindrome(String word){
        word = word.replace(" ","");
        return new StringBuilder(word).reverse().toString().equalsIgnoreCase(word);
    }
}


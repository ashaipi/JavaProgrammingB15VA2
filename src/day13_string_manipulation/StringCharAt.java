package day13_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String company = "Cybertek";
        System.out.println("company.length() = " + company.length());
        System.out.println(company.charAt(0));
        System.out.println(company.charAt(1));
        System.out.println(company.charAt(2));
        System.out.println(company.charAt(3));
        System.out.println(company.charAt(4));
        System.out.println(company.charAt(5));
        System.out.println(company.charAt(6));
        System.out.println(company.charAt(7));
        //System.out.println(company.charAt(8)); //StringIndexOutOfBoundsException

        for(int i=0;i<company.length();i++) System.out.println(company.charAt(i));
        
        char first = company.charAt(0);
        System.out.println("first = " + first);

        if(company.charAt(0) == 'C') System.out.println("C is first letter");
        else System.out.println("C us not first letter");

        String word = "civic"; // palindrome word
        if(word.charAt(0) == word.charAt(word.length()-1))
            System.out.println("first and last match");
        else System.out.println("first and last don't match");
        /*
        for(int i=0;i<word.length();i++){
            if(i==word.length()) break;
            if(word.charAt(i) != word.charAt(word.length()-(1+i))){
                System.out.println("not palindrome"); break;
            }

            System.out.println("not palindrome"); break;
        */
        
        word = word.charAt(0)+" "+word.charAt(1)+" "+word.charAt(2)+" "+ word.charAt(3)+" "+word.charAt(4);
        System.out.println("word = " + word);
        

        }

}

package assignment_nov_29_2019_task2;

public class Task14 {
    public static void main(String[] args) {
        /*
        Ask user to enter sentence with any number of words
        For example I love Java Java Java Java
        write a program to print last word
        remove last word from the sentence
        check weather remaining part still contains last word

        for example :
        1, I love Java Java Java Java  -->> Java
        2, I love Java Java Java
        3, I love Java Java Java still contains last word
         */            //            1         2
                       //  012345678901234567890123456
        String sentence = "I love Java Java Java Java";
        System.out.println("sentence = " + sentence);

        int firstLastSpace = sentence.lastIndexOf(" ");

        String firstLastWord=sentence.substring(firstLastSpace+1,sentence.length());
        System.out.println(firstLastWord);

        sentence=sentence.substring(0,firstLastSpace);

        int secondLastSpace = sentence.lastIndexOf(" ");

        String secondLastWord=sentence.substring(secondLastSpace+1,sentence.length());
        System.out.println(sentence);

        if(firstLastWord.equals(secondLastWord))
            System.out.println(sentence+" still contains last word");
        
    }
}

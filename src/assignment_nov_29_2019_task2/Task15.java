package assignment_nov_29_2019_task2;

public class Task15 {
    public static void main(String[] args) {
        /*
        Enter user to ask two words
        and store it into word1 word2 String variables
        if word1 contains word2 ,
            print the location of word2 in word1
        for example ABCDE , BC  -->> BC is at index 1 in word1
        then replace word2 part of word1 with ZZZ
        for example ABCDE , BC  -->> AZZZDE

        if word2 exists in word1 , replace word1 with ZZZ
        for example BC , ABCDE    -->> AZZZDE
         */
        String word1 = "ABCDE", word2 = "BC";

        if(word1.contains(word2)){
            int firstLocation = word1.indexOf(word2);
            System.out.println("firstLocation = " + firstLocation);
            int lastLocation = firstLocation+word2.length()-1;
            System.out.println("lastLocation = " + lastLocation);

            System.out.println(word1+", "+word2+"  -->> "+word1.replace(word2,"ZZZ"));
        }


        word1 = "BC"; word2 = "ABCDE";

        if(word2.contains(word1))
            System.out.println(word1+", "+word2+"  -->> "+word2.replace(word1,"ZZZ"));

    }
}

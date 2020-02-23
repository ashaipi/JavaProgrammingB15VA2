package day15_string_manipulation;

public class StringReplace {
    public static void main(String[] args) {
        String words = "sad, cry, python";
        System.out.println(words.replace("sad","happy"));
        System.out.println(words.replace("cry","smile"));
        System.out.println(words.replace("python","java"));
        System.out.println("words = " + words);
        words=words.replace("sad","happy");
        words=words.replace("cry","smile");
        words=words.replace("python","java");
        System.out.println("words = " + words);
        words=words.replace(", ","|");
        System.out.println("words = " + words);
        
        String capital = "london is capital of UK";
        capital = capital.replace("london","Tripoli").replace("UK","Libya");
        System.out.println("capital = " + capital);
        
        
    }
}

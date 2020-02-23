package assignment;
import java.util.*;

public class Test1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {"hello", "why", "by", "apple" , "note"};
        String[] w = new String[words.length];
        //{input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


                //TODO: Write your code below
                //for(String s : words)
                for(int i=0; i< words.length; i++)
                    w[i]=words[i].charAt(0)+""+words[i].charAt(words[i].length()-1);
                System.out.println(Arrays.toString(w));


            }
}

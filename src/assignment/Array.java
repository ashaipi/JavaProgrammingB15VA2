package assignment;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String a="java, github username, javajava, python, adhkjava";
        int count=0;
        for(int i=0;i<a.length()-3;i++) {
            if(a.substring(i,i+4).equals("java")) count++;
        }

        System.out.println(count);

    }
}

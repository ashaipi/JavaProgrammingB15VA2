package assignment;
import java.util.*;

public class DecToBin {
    public static void main(String[] args) {
        int dec=4,re;
        int[] d = new int[8];

        for(int i=0 ; i<8 ; i++,dec/=2) d[7-i] = dec % 2;

        System.out.println(Arrays.toString(d));

    }
}

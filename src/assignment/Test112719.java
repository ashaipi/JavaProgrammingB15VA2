package assignment;

import org.w3c.dom.ls.LSOutput;

public class Test112719 {
    public static void main(String[] args) {
        //20394
        int x = 20394;
        int s = x / 60;
        int m = s / 60;
        int h = m / 60;

        System.out.println("x"+x);
        System.out.println("s"+s);
        System.out.println("m"+m);
        System.out.println("h"+h);

        System.out.println(x%60);
        System.out.println(s%60);
        System.out.println(m%60);
        System.out.println(h%60);
    }
}
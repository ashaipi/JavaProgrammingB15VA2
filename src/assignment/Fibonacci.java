package assignment;

public class Fibonacci {
    public static void main(String[] args) {
        int f=0,a=0,b=1;
        System.out.println(f);
        for (int i = 1; i < 10 ; i++) {
            f=a+b;
            System.out.println(f);
            b=a;
            a=f;
        }
    }
}

package assignment;


import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        isPalindrome(1234321);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        int j=0, digits=1,ln=num, leftNum=num, rightNum=0;
        boolean b = false;
        for (int i = num; i > 0 ; i/=10) j++;
        for (int i = 0; i < j-1 ; i++) digits*=10;
        System.out.println("J= "+j+"   d: "+digits);
        j/=2;
        for (int i = num; j > 0 ; i/=10,digits/=10,j--) {
            System.out.print((i-((i/10)*10)));
            rightNum=i%10;
            leftNum=ln;
            ln=(ln-(ln/digits)*digits);
            leftNum=(leftNum-ln)/digits;
            if(leftNum==rightNum) b=true;
        }
        if(b) System.out.println("palindrome");
        else System.out.println("Non-palindrome");

    }
}


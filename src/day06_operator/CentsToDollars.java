package day06_operator;

import com.sun.security.jgss.GSSUtil;

import javax.swing.*;

public class CentsToDollars {
    public static void main(String[] args){
        int cents,dollars;
        cents=250;
        dollars=cents/100;
        cents=cents%100;

        System.out.println(dollars+" dollars and "+cents+" cents");
    }
}

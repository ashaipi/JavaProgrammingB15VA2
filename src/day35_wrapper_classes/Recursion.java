package day35_wrapper_classes;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        printNum(1);
    }
    public static void printNum(int num){
        System.out.println(num++);
        if(num<=11269) printNum(num);
    }
}

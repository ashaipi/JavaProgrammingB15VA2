package day32_custommethods;

import com.sun.security.jgss.GSSUtil;

public class AboutMe {
    public static void main(String[] args) {
        myName();
        morning();
        code();
    }

    public static void myName(){
        System.out.println("Hello my name is Abubaker");
    }

    static void morning(){
        System.out.println("I wake up at 7 am");
        System.out.println("I have my breakfast");
        System.out.println("Goto School");
    }

    public static void code(){
        System.out.println("I code java");
        System.out.println("Java is fun");
    }
}

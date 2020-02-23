package day16_memory_while_loop_intro;

import java.util.Arrays;

public class WhileLoopIntro {
    public static void main(String[] args) {
        int num = 1;
        if (num <= 5) System.out.println("Hello world!");

        while (num <= 5) {
            System.out.println(num + " - Hello world!");
            num++;
        }

        int steps=1;
        while (steps<=100){
            System.out.println("Taking a step "+steps);
            steps+=1;
        }
    }
}

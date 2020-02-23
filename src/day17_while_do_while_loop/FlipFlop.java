package day17_while_do_while_loop;

public class FlipFlop {
    public static void main(String[] args) {
        String word = "code java", flipFlop;
        System.out.println("word = " + word);
        int findSpace = word.indexOf(" ");

        flipFlop = (word.substring(findSpace+1)+" "+word.substring(0,findSpace)).toUpperCase();
        System.out.println("flipFlop = " + flipFlop);
    
    }
}

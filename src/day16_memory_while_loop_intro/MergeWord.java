package day16_memory_while_loop_intro;

public class MergeWord {
    public static void main(String[] args) {
        String pattern = "{[]}";
        String word = "java";
        String merged = pattern.substring(0,2)+word+pattern.substring(2);
        System.out.println("merged = " + merged);
    }
}

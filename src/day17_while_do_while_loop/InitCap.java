package day17_while_do_while_loop;

public class InitCap {
    public static void main(String[] args) {
        String word = "compUTER", inCap;
        System.out.println("word = " + word);

        inCap=word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        System.out.println("inCap = " + inCap);
    }
}

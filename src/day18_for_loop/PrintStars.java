package day18_for_loop;

public class PrintStars {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) System.out.print("* ");

        System.out.println();

        String myStars = "";
        int starsCount=9;
        for (int i=0; i<starsCount;i++) myStars+="*";

        System.out.println("myStars= "+myStars);
    }
}

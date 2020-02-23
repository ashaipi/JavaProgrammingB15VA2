package day20_forloop_3;

public class Neighbors {
    public static void main(String[] args) {
        String str = "jaavvaa iis fuun";
        for (int i = 0; i < str.length()-1; i++)
            if(str.charAt(i)==str.charAt(i+1)) System.out.println("beeep - "+str.charAt(i));
    }
}

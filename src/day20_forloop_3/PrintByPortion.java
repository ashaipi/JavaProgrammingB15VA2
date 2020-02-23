package day20_forloop_3;

public class PrintByPortion {
    public static void main(String[] args) {
        String str = "pizza, soup, chicken, kebab, shrimp, ice cream";
        for (int i = 0; i < str.length()-3 ; i++) {
            System.out.println(str.substring(i,i+3));
            if(str.substring(i,i+3).equals("sou")) System.out.println("-----found");
        }
    }
}

package day19_forloop_2;

public class CountHowMany {
    public static void main(String[] args) {
        String str = "java loops are fun";
        char ch='a';
        int count=0;

        for (int i = 0; i < str.length(); i++) {
            if(ch==str.charAt(i)) count++;
        }
        System.out.println("Count: "+count);
    }
}

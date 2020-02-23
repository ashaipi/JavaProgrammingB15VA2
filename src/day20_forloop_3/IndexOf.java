package day20_forloop_3;

public class IndexOf {
    public static void main(String[] args) {
        String word = "jva is fun";
        char letter='n';
        int index = -1;

        for (int i = 0; i < word.length(); i++)
            if(word.charAt(i)==letter)  {index=i;break;}
        if(index!=-1) System.out.println("letter ["+letter+"] is in position ["+index+"]");
        else System.out.println("Not found!");
    }
}

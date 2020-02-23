package day21_forloop_4_arrayintro;

public class FindUniqueChars {
    public static void main(String[] args) {
         String str ="jjjjjaaaaaavvvvvaaaa", unique="",temp="";
        for (int i = 0; i < str.length() ; i++) {
            temp =str.charAt(i)+"";
            if(!unique.contains(temp)) unique+=temp;
        }
        System.out.println(unique);

        for (int i = 0; i < str.length() ; i++) {
            temp=str.charAt(i)+"";
            if (temp.contains(str.substring(i + 1))) unique += temp;
            else break;
        }
        System.out.println(unique);
    }
}

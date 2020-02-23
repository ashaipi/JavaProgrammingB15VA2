package day21_forloop_4_arrayintro;

public class ReadByPortionPractice {
    public static void main(String[] args) {
        String str = "java, github username, javajava, python, automation java tools, java is most popular";
        int count=0;

        for(int i=0; i<str.length();i++) {
            System.out.println(str.charAt(i));
        }

        for(int i=0; i<str.length()-3;i++) if(str.substring(i,i+4).equals("java")) count++;

        System.out.println(count);



    }
}

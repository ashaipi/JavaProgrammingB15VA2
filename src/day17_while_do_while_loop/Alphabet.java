package day17_while_do_while_loop;

public class Alphabet {
    public static void main(String[] args) {
        char letter='z'+1;
        //System.out.println("letter = " + letter+" --> ASCII "+ (int) letter);

        while(letter<='z'){
            System.out.print(letter+" ");
            ++letter;
        }

        --letter;
        System.out.println();

        while(letter>='a'){
            System.out.print(letter+" ");
            --letter;
        }

        System.out.println();

        String str="A";
        letter='A';
        while(letter<='Z'){
            str+=letter;
            System.out.println(str);
            str+=++letter;
        }
    }
}

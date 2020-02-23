package assignment;

import java.util.Random;

public class RandomChar {
    public static void main(String[] args) {
        Random rdn = new Random();                                                      //  122
        char random = (char) (rdn.nextInt(25) + 97); // random ASCII code from [97..(97+25)]
        System.out.println("Random Character: " + random);


        Random rd = new Random();
        char rand = (char) (rd.nextInt(25) + 'a');  // random char form [a..z]
        System.out.println("Random Character: " + rand);


                    //  01234567890123456789012345
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String letters = "";
        System.out.println("alphabet:  "+chars);
        Random rnd = new Random();
        for(int i=0 ; i<=25 ; i++) {
            char c = chars.charAt(rnd.nextInt(chars.length()));
            chars=chars.replace(c+"","");
            letters+=c;
        }
        System.out.println("encrypted: "+letters);

    }
}

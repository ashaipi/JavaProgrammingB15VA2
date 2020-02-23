package day22_arrays_intro;

public class FindNonDuplicates {
    public static void main(String[] args) {
        String str = "abbccdeef";

        for (int i = 0; i < str.length(); i++) {
            char outerLetter = str.charAt(i); // read a letter an store outerLetter
            System.out.println("letter = " + outerLetter); //print outerLetter
            int count =0; // reset to 0 each time. to check if duplicate found count: 0 1 2 ..
            for (int j = 0; j < str.length() ; j++) {
                // inner loop tp loop through each letter again
                char innerLetter = str.charAt(j);
                if(outerLetter == innerLetter && i != j){
                    //check if letter matches any letter in inner loop
                    // also make sure i and j are not same
                    // if they are same, it will mean we are looking same letter in same position
                    System.out.println(outerLetter+" has a duplicate");
                }
                if(count==0) System.out.println();
                else System.out.println();
            }
        }

        System.out.println("----------------------------");
        // "abbccdeef"
        for (int i = 0; i < str.length() ; i++) {
            int temp = 0;
            for (int j = 0; j < str.length() ; j++) if(str.charAt(i)==str.charAt(j)) temp++;
            if(temp==1) System.out.println("not duplicate -> "+ str.charAt(i));
        }
    }
}

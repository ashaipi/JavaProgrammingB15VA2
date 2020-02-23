package day21_forloop_4_arrayintro;

public class LookForError {
    public static void main(String[] args) {
        String log = "<error:atable style=display: none;<tbody><error:btr id=edit_rubric><td " +
                     "coerror:qlspan=4><form id=error:jedit_rubric_form class=edit-rubric-formerror:p " +
                     "no-margin-bottom>error:a";
        String word = "error";
        char errorType;
        int count=0, wordLength=word.length();

        for(int i=0; i<log.length()-wordLength-1;i++) {
            if(log.substring(i,i+wordLength).equals(word)) {
                errorType=log.charAt(i+wordLength+1);
                System.out.printf("ERROR FOUND! At index - %3d, ERROR TYPE: %c\n",i,errorType);
                count++;
            }
        }
        if(count>0) System.out.println("FAIL: ["+count+"] ERRORS DETECTED IN THE LOG");
        else System.out.println("PASS: NO ERRORS DETECTED IN THE LOG");
    }
}

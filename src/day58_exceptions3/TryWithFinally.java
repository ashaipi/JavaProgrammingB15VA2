package day58_exceptions3;

public class TryWithFinally {
    public static void main(String[] args) {
        // Don't try to use it in real coding, where they pay you
        try{
            System.out.println("In try block...");
            System.out.println(9/0);
        }finally{
            System.out.println("In finally block..runs always");
        }
        System.out.println("After try finally...");
    }
}

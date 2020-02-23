package day56_exceptions1;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Before try catch");
        try {
            int result = 10 / 0;
        }catch(ArithmeticException e){
            System.out.print("ERROR-Divided by zero: ");
            System.out.println("Exception happened, and was handled");
        }
        System.out.println("After try catch");

        try{
            System.out.println("In second try block");
            String str = "java is fun!";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        }catch (Exception e){
            System.out.println("Exception happened in try block and caught!");
        }
    }
}

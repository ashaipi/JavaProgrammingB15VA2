package day57_exceptions2;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("1-Before try catch");
        try{
            System.out.println("1-Hello from try block");
            String str=null;
            System.out.println(str.length());  // NullPointerException
        }catch(Exception e){
            System.out.println("1-Exception happened and caught");
        }
        System.out.println("1-After try catch");

        try{
            System.out.println("2-Hello from try block");
            String str=null;
            System.out.println(str.length());  // NullPointerException
        }catch(Exception e){
            System.out.println("2-Exception happened and caught");
        }finally{
            System.out.println("2-Finally block. Runs if there is exception for no exception");
        }
        System.out.println("2-After try catch");

    }
}

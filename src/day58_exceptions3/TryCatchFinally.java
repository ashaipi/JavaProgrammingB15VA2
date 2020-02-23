package day58_exceptions3;
import java.net.*;

public class TryCatchFinally {
    public static void main(String[] args) {
        // Unhandled exception: java.net.MalformedURLException
        try {
            System.out.println("IN TRY BLOCK...");
            URL stdyURL = new URL("www.etsy.com");
            System.out.println("END OF TRY BLOCK...");
        }catch(MalformedURLException e){
            System.out.println("MalformedURLException is caught and handled...");
            System.out.println("Reason: "+e.getMessage());
            System.out.println("getCause(): "+e.getCause());
        }finally{
            System.out.println("Finally Block - runs always");
        }
        System.out.println("After 2nd try catch finally");
    }
}

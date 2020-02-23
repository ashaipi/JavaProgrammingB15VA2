package day52_interface;

public interface VoiceCallable {
    //public static final variables ONLY
    public static final boolean CAN_CALL = true; // every variable by default (public static final)


    //abstract method
    public abstract void call(String contact);

    /*
    Only abstract methods before Java 8. Pure abstraction
    /AFTER JAVA 8 - static and default method are added
     */

    //static method:
    public static void decline(){
        System.out.println("Nadir decline voice call...");
    }

    //default method:
    public default void accept(){
        System.out.println("Nadir finally accepted voice call...");
    }
}

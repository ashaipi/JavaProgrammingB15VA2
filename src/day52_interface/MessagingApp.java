package day52_interface;

public abstract class MessagingApp {

    public String name;
    protected boolean isFree;
    boolean allOSCompatible;
    private static int count;
    public static final String APP_TYPE = "Messaging";

    //constructor
    public MessagingApp(){
        System.out.println("MessagingApp no-args constructor...");
    }

    //abstract method
    public abstract void sendMessage(String msg);

    //non-abstract method
    public void launch(){
        System.out.println("MessagingApp is launching");
    }

    //static method
    public static void close(){
        System.out.println("Messaging App is closing");
    }

}

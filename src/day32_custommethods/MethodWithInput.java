package day32_custommethods;

public class MethodWithInput {
    public static void displayMessage(String message){
        System.out.println(message);
    }

    public static void greetByName(String name){
        System.out.println("Hello, "+name+", how are yoy?");
    }

    public static void count(int num){
        for (int i = 0; i <= num ; i++) System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        displayMessage("Java is fun");
        displayMessage("Coding java today");
        greetByName("Abubaker");
        greetByName("Ali");
        String fullName = "Abubaker Ashaipi";
        greetByName(fullName);
        count(5);
    }
}

package day32_custommethods;

public class SimpleMethod {

    public static void displayMessage1(){
        System.out.println("Hello World from my first method [1]");
    }
    public static void displayMessage2(String str){
        System.out.println(str+" [2]");
    }
    public static String displayMessage3(String str){
        return str+" [3]";
    }
    public void displayMessage4(){
        System.out.println("Hello World from my first method [5]");
    }

    public static void main(String[] args) {
        String st="Hello World from my first method";
        displayMessage1();
        displayMessage2(st);
        System.out.println(displayMessage3(st));

        SimpleMethod dm = new SimpleMethod();
        dm.displayMessage4();
    }
}

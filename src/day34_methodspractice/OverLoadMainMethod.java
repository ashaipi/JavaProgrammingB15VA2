package day34_methodspractice;

public class OverLoadMainMethod {
    public static void main(String[] args) {
        System.out.println("hello world!");
        main(4);
    }

    /*
    overloading a mani method
    - same name
    - different parameter
      but this new main method, is not what JDK(java) looks for when starting code execution.
     */
    public static void main(int num) {
        System.out.println("num "+num);

    }
}

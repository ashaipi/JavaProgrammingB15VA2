package day44_static;

public class StaticTest {
    public static void main(String[] args) {
        System.out.println(new StaticVariables().name);
        System.out.println(StaticVariables.userName);
        System.out.println(StaticVariables.age);
        System.out.println(StaticVariables.price);

        System.out.println(new Calculator().plus(4,6)); // plus is instance method
        System.out.println(Calculator.minus(10,4));     // minus is static method
        System.out.println(Calculator.divide(25,2));

        System.out.println(Math.abs(-11));
        System.out.println(Math.max(100,500));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(5,2));
        System.out.println(Math.round(85.55));
        System.out.println(Math.E);
        System.out.println(Math.PI);
    }
}

package day10_switch_logical_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int apples = 10;
        int oranges = 20;

        System.out.println("### TRUTH TABLE FOR && OPERATOR ###");
        System.out.println("\ntrue && true is " + (true && true));
        if (apples == 10 && oranges == 20) System.out.println("Condition is TRUE");
        else System.out.println("Condition is FALSE");

        System.out.println("\nfalse && true is " + (false && true));
        if (apples != 10 && oranges == 20) System.out.println("Condition is TRUE");
        else System.out.println("Condition is FALSE");

        System.out.println("\ntrue && false is " + (true && false));
        if (apples == 10 && oranges != 20) System.out.println("Condition is TRUE");
        else System.out.println("Condition is FALSE");

        System.out.println("\nfalse && false is " + (false && false));
        if (apples != 10 && oranges != 20) System.out.println("Condition is TRUE");
        else System.out.println("Condition is FALSE");
    }
}

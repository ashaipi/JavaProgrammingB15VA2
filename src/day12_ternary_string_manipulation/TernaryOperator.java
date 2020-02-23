package day12_ternary_string_manipulation;

public class TernaryOperator {
    public static void main(String[] args) {
        int num1 = 55, num2 = 10, max;

        max = (num1 > num2) ? num1 : num2;
        System.out.println("max = " + max);

        int score = 88;
        String result = score >= 60 ? "pass" : "fail" ;
        System.out.println("result = " + result);
    }
}

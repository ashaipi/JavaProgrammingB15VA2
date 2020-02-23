package day09_multibranch_switch;

public class CalculatorV1 {
    public static void main(String[] args) {
        double num1=10,num2=5;
        char operator='-';

        if(operator=='+') num1+=num2;
        else if(operator=='-') num1-=num2;
        else if(operator=='*') num1*=num2;
        else if(operator=='/') num1/=num2;
        else System.out.println("Invalid operator");

        System.out.println(num1);

    }
}

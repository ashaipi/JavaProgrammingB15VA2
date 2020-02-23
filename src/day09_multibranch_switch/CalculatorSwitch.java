package day09_multibranch_switch;

public class CalculatorSwitch {
    public static void main(String[] args) {

        double num1=10,num2=5;
        char operator='*';

        switch(operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid operator");
        }


        int score=4;
        switch (score) {
            case 1:
                System.out.println("fail");
                break;
            case 2:
                System.out.println("fair");
                break;
            case 3:
                System.out.println("good");
                break;
            case 4:
                System.out.println("excellent");
                break;
            default:
                System.out.println("invalid");
        }

        String str="abu";
        switch (str){
            case "abu":
                System.out.println("abu--");
                break;
            case "aaa":
                System.out.println("aaa--");
                break;
        }
    }
}

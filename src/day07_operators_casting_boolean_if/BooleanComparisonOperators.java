package day07_operators_casting_boolean_if;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10 > 5);
        System.out.println(10>11);

        System.out.println(88>=77);
        System.out.println(99>=99);
        System.out.println(100>=119);

        System.out.println(5<7);
        System.out.println(15<7);

        System.out.println(10<=15);
        System.out.println(10<=10);
        System.out.println(10<=1);

        System.out.println(100==100);
        System.out.println(100==1000);

        System.out.println(5!=4);
        System.out.println(10!=10);
        System.out.println("-------------------");
        int n1 = 100;
        int n2 = 200;
        System.out.println(n1>n2);
        System.out.println(n1<n2);
        System.out.println(n1==n2);
        System.out.println(n1!=n2);

        boolean b1 = 123 > 100;
        System.out.println(b1);

        int currentSpeed = 60;
        int speedLimit = 55;
        boolean overLimit=currentSpeed > speedLimit;
        System.out.println("over limit: "+overLimit);

        currentSpeed=55;
        boolean underOrAtLimit = currentSpeed <= speedLimit;
        System.out.println("Under or at limit: "+underOrAtLimit);

        boolean atExactLimit = currentSpeed == speedLimit;
        System.out.println("At exact limit: "+atExactLimit);

        double balance = 150.0;
        boolean broke = balance <= 0.0;
        System.out.println("Am I broke? - "+broke);

        double bagPrice = 120.0;
        broke = (balance - bagPrice) <= 0.0;
        System.out.println("Am I broke? - "+broke);

        char letter1 = 'A';
        char letter2 = 'b';
        System.out.println(letter1 > letter2);
        System.out.println(letter1 < letter2);
        System.out.println(letter1 != letter2);

        System.out.println("Wooden spoon"=="Wooden spoon");
        String str="java";
        System.out.println(str == "java");


    }
}

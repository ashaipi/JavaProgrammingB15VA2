package day07_operators_casting_boolean_if;

public class TypeCasting {
    public static void main(String[] args) {
        //Automatic casting -> Implicit casting
        //From Small to large
        byte b = 100;
        short sh = b;
        int i = sh;
        System.out.printf("\nb; %d",b);
        System.out.printf("\nsh: %d",sh);
        System.out.printf("\ni: %d",i);

        int n = 1234567;
        long  l= n;
        System.out.printf("\nn: %d",n);
        System.out.printf("\nl: %d",l);

        double d = n;
        System.out.printf("\nd: %f",d);

        //Explicit casting: parentheses before variable name and type

        int n2 = 120;
        byte b2 = (byte) n2;
        System.out.printf("\nn2: %d",n2);
        System.out.printf("\nb2: %d",b2);

        double price = 120.44;
        int intPrice = (int) price;
        System.out.printf("\nprice: %f",price);
        System.out.printf("\nintPrice: %d\n",intPrice);

        int num3 = 129;
        byte b3 = (byte) num3;
        System.out.println("num3: "+num3);
        System.out.println("b3: "+b3);

        int num4 = 23455;
        String str1= num4+"";
        System.out.println("num4: "+num4);
        System.out.println("str1: "+str1);

        int num5= 65;
        char str2 = (char) num5;
        System.out.println("num5: "+num5);
        System.out.println("str: "+str2);

    }
}

package assignment;

public class MethodOverloading {
    public static int add(int a, int b){
        return a+b;
    }

    public  double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(add(2,3));
        System.out.println(obj.add(2.5,3.5));
    }
}

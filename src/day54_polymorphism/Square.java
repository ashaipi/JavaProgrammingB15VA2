package day54_polymorphism;

public class Square extends Shape {
    public Square(){
        type = "square";
    }
    public  void squareMethod(){
        System.out.println("squareMethod");
    }

    @Override
    public void draw(){
        System.out.println("**********");
        System.out.println("*        *");
        System.out.println("*        *");
        System.out.println("*        *");
        System.out.println("**********");
        System.out.println();
    }

}

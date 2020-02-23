package day54_polymorphism;

import day06_operator.ShortHandOperators;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Diamond diamond = new Diamond();

        shape.draw();
        square.draw();
        triangle.draw();
        diamond.draw();

        // POLYMORPHISM: reference type is parent class or interface
        // object type is sub class
        System.out.println("----- POLYMORPHISM -----");
        Shape shape1 = new Square();
        shape1.draw();

        shape1 = new Triangle();
        shape1.draw();

        shape1 = new Diamond();
        shape1.draw();

        //======= Create 4 shapes using polymorphism
        Object shapeObj = new Shape();
        Shape squareObj = new Square();
        Shape triangleObj = new Triangle();
        Shape diamondObj = new Diamond();

        //
        ((Square)squareObj).squareMethod();


    }
}

package day54_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class InstanceOf {
    public static void main(String[] args) {
        Shape diamond = new Diamond();
        // to print package name with class name
        System.out.println(diamond.getClass().getName());
        // to print class name
        System.out.println(diamond.getClass().getSimpleName());

        Shape shape = new Shape();
        System.out.println("Shape is referring to object of "+shape.getClass().getSimpleName());

        if(shape.getClass().getSimpleName().equals("Square"))
            System.out.println("It is object of Square class");

        System.out.println(shape instanceof Square);

        if(shape instanceof Square)       System.out.println("Square object");
        else if(shape instanceof Diamond) System.out.println("Diamond object");

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Shape());
        shapeList.add(new Square());
        shapeList.add(new Square());
        shapeList.add(new Diamond());
        shapeList.add(new Triangle());
        shapeList.add(new Shape());
        shapeList.add(new Square());
        shapeList.add(new Square());
        shapeList.add(new Diamond());
        shapeList.add(new Triangle());
        shapeList.add(new Shape());
        shapeList.add(new Square());
        shapeList.add(new Square());
        shapeList.add(new Diamond());
        shapeList.add(new Diamond());
        shapeList.add(new Shape());
        shapeList.add(new Square());
        shapeList.add(new Square());
        shapeList.add(new Diamond());
        shapeList.add(new Triangle());

        int shapeCount=0, triangleCount=0, squareCount=0, diamondCount=0;

        for(Shape each : shapeList){
            if(each instanceof Square) squareCount++;
            else if(each instanceof Triangle) triangleCount++;
            else if(each instanceof Diamond) diamondCount++;
            else if(each instanceof Shape) shapeCount++;
        }

        System.out.println("---- instanceof ----");
        System.out.println("Total Shapes   "+shapeCount);
        System.out.println("Total Squares  "+squareCount);
        System.out.println("Total Triangle "+triangleCount);
        System.out.println("Total Diamond  "+diamondCount);

        shapeCount=triangleCount=squareCount=diamondCount=0;

        for(Shape each : shapeList){
            if(each.getClass().getSimpleName().equals("Square")) squareCount++;
            else if(each.getClass().getSimpleName().equals("Triangle")) triangleCount++;
            else if(each.getClass().getSimpleName().equals("Diamond")) diamondCount++;
            else if(each.getClass().getSimpleName().equals("Shape")) shapeCount++;
        }

        System.out.println("--- getClass().getSimpleName().equals() --- ");
        System.out.println("Total Shapes   "+shapeCount);
        System.out.println("Total Squares  "+squareCount);
        System.out.println("Total Triangle "+triangleCount);
        System.out.println("Total Diamond  "+diamondCount);

    }
}

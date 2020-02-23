package day55_polymorphism2;
import day54_polymorphism.*;
import java.util.*;

public class ShapeManager {
    public static void drawSquare(Square squareObj){
        System.out.println("--- DRAWING SQUARE ---");
        squareObj.draw();
    }

    public static void drawShape(Shape shapeObj) {
        System.out.println("--- DRAWING SHAPE --- "+shapeObj.type+" ---");
        shapeObj.draw();
    }

    public static void drawShape(List<Shape> shapeList) {
        System.out.println("shapeList.get(0).type  --> "+shapeList.get(0).type);
        System.out.println("shapeList.get(2).type  --> "+shapeList.get(2).type);
        System.out.println();

        for(Shape each : shapeList) {
            System.out.println("--- DRAWING SHAPE --- " + each.type + " ---");
            each.draw();
        }
    }

    public static void drawShapeFromObject(Object obj){
        System.out.print("Drawing shape form object --->  ");
        System.out.println(obj.getClass().getSimpleName());
    }

    public static Shape buildShape(String type){
        System.out.println("Building shape of type - "+type+"...");
        Shape obj= null;
        switch(type.toLowerCase()){
            case "shape":    obj = new Shape();   break;
            case "triangle": obj = new Triangle();break;
            case "diamond":  obj = new Diamond(); break;
            case "square":   obj = new Square();  break;
        }
        return obj;
    }
}

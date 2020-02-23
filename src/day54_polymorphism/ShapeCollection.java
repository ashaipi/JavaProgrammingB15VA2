package day54_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollection {
    public static void main(String[] args) {
        // declare array that can store 2 squares
        Square[] squaresArr = new Square[2];
        squaresArr[0]=new Square();
        squaresArr[1]=new Square();

        squaresArr[0].draw();
        squaresArr[1].draw();

        //Shape array with polymorphism
        Shape[] shapesArr = new Shape[4];
        shapesArr[0] = new Shape();
        shapesArr[1] = new Square();
        shapesArr[2] = new Triangle();
        shapesArr[3] = new Diamond();
        System.out.println("---- shapes Array ----");
        //Draw each shape using for loop
        for (int i = 0; i < shapesArr.length; i++) shapesArr[i].draw();

        //draw each shape using each loop
        for(Shape each : shapesArr) each.draw();

        List<Shape> shapesList = new ArrayList<>();
        shapesList.add(new Shape());
        shapesList.add(new Square());
        shapesList.add(new Triangle());
        shapesList.add(new Diamond());
        System.out.println("---- shapes ArrayList ----");
        for(Shape each : shapesList) each.draw();
    }
}

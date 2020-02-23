package day55_polymorphism2;
import day54_polymorphism.*;
import java.util.*;
import static day55_polymorphism2.ShapeManager.*; //static import

public class ShapeAction {
    public static void main(String[] args) {
        Square mySquare = new Square();
        ShapeManager.drawShape(mySquare);  // to pass square object

        ShapeManager.drawSquare(new Square());

        //polymorphism declare and assing 4 objects
        Shape myShape = new Shape();
        Shape myDiamond = new Diamond();
        Shape myTriangle = new Triangle();
        Shape mySquare1 = new Square();

        System.out.println("###########################");
        ShapeManager.drawShape(myShape); //options: object of shape, dquare, triangle, diamond
        ShapeManager.drawShape(myDiamond);
        ShapeManager.drawShape(myTriangle);
        ShapeManager.drawShape(mySquare1);

        System.out.println("###########################");
        ShapeManager.drawShape(new Shape()); //options: object of shape, dquare, triangle, diamond
        ShapeManager.drawShape(new Diamond());
        ShapeManager.drawShape(new Triangle());
        ShapeManager.drawShape(new Square());

        System.out.println("###########################");
        System.out.println("---- OBJECT PARAMETER ----");
        ShapeManager.drawShapeFromObject("java");
        ShapeManager.drawShapeFromObject(true);
        ShapeManager.drawShapeFromObject(123);
        ShapeManager.drawShapeFromObject(123.5);
        ShapeManager.drawShapeFromObject('a');
        ShapeManager.drawShapeFromObject(myShape);

        System.out.println("###########################");
        Object obj = new Random();
        System.out.println(obj.toString());

        //cast to Random and call nextInt
        int randomNum = ((Random) obj).nextInt(11);
        System.out.println("randomNum = " + randomNum);

        //Downcast from Object to Random and assign to variable
        Random r = (Random) obj;
        System.out.println("Random Number: "+r.nextInt(5));

        System.out.println("----- METHOD WITH LIST<SHAPE> ---");
        List<Shape> myList = new ArrayList<>();
        myList.add(new Shape());    myList.add(new Shape());
        myList.add(new Diamond());  myList.add(new Diamond());
        myList.add(new Square());   myList.add(new Square());
        myList.add(new Triangle()); myList.add(new Triangle());

        ShapeManager.drawShape(myList);

        System.out.println("---- METHOD WITH SHAPE RETURN ----");
        // because of (import static day55_polymorphism2.ShapeManager.*;) we don not have to
        // write ShapeManager.
        buildShape("diamond").draw();

        Shape tr = buildShape("triangle");
        tr.draw();

    }
}

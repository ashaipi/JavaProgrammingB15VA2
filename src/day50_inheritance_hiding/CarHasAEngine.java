package day50_inheritance_hiding;

public class CarHasAEngine {
    public static void main(String[] args) {
        Engine myCarEngine = new Engine("m5025", 192, 6);
        System.out.println(myCarEngine.toString());

        Car bmw = new Car("BMW 525i",myCarEngine);
        System.out.println(bmw.getEngine().toString());

        //Engine gtEngine = new Engine("m256",577,8);
        //Car gt = new Car("Mercedes Gt Amg",gtEngine);

        Car gt = new Car("Mercedes Gt Amg",new Engine("m256",577,8));
        System.out.println(gt.getEngine().toString());
        System.out.println(gt.toString());

        Car corolla = new Car();
        corolla.setModel("Toyota Corolla");
        corolla.setEngine(new Engine("c45i", 180, 4));
        System.out.println(corolla.toString());


    }

}

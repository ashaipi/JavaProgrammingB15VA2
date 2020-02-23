package day51_abstraction;

public class ElectricCarObject {
    public static void main(String[] args) {
        // ElectricCar ec = new ElectricCar() // ERROR, cannot be instantiated

        Tesla model = new Tesla();
        model.model = "Model S";
        model.price = 43000;
        model.color = "gray";
        model.charge();
        model.start();
        model.drive();
        model.stop();

        Ford fusion = new Ford();
        fusion.charge();
        fusion.start();
        fusion.drive();
        fusion.stop();

        TeslaSemi semi = new TeslaSemi();
        semi.charge();
        semi.start();
        semi.drive();
        semi.stop();
        semi.load("Potatoes");

        TeslaTruck tk = new TeslaTruck();
        tk.model = "CyberTruck";
        tk.price = 150000;
        tk.color = "White";
        tk.charge();
        tk.start();
        tk.drive();
        tk.stop();
        tk.load("tomatoes");

        System.out.println(model.toString());
        System.out.println(fusion.toString());
        System.out.println(tk.toString());

    }
}

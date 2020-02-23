package day43_constructor;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private double price;
    
    public Car() {}
    public Car(String model, double price){
        this.model = model;
        this.price = price;
        
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car("Kia optima", 25345.99);
        //Create Array of Cars
        Car[] carArray = new Car[4];
        carArray[0] = new Car("Nissan altima", 21333.99);
        carArray[1] = new Car("Nissan Versa", 21333.99);
        carArray[2] = new Car("Nissan Leaf", 25333.99);
        carArray[3] = new Car("Nissan Maxima", 39333.99);

        for(Car c : carArray) System.out.println(c);

        List<Car> carList = new ArrayList<>();
        Car altima = new Car("Nissan altima", 21333.99);
        carList.add(altima);
        Car versa = new Car("Nissan Versa", 21333.99);
        carList.add(versa);
        Car leaf = new Car("Nissan Leaf", 25333.99);
        carList.add(leaf);
        Car maxima = new Car("Nissan Maxima", 39333.99);
        carList.add(maxima);
        System.out.println("carList = " + carList);
    }
}

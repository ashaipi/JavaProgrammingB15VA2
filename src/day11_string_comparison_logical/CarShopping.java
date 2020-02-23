package day11_string_comparison_logical;
import java.util.Scanner;
public class CarShopping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String carModel;
        int carPrice, budget=35000;
        System.out.println("Welcome to our Car Dealership!");
        System.out.println("Enter model:");
        carModel=in.next();
        System.out.println("Enter price:");
        carPrice=in.nextInt();
        boolean isCar = carModel.equals("toyota") || carModel.equals("bmw") || carModel.equals("audi") || carModel.equals("tesla");

        //  Condition: We will be buying the car only when carModel is "toyota", "bmw", "audi", tesla"

        if(isCar && carPrice<=budget)
            System.out.println("I am interested in purchasing this car!");
        else
            System.out.println("I am not interested in purchasing this car");


    }
}

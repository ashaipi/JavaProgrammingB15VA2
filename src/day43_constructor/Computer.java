package day43_constructor;

public class Computer {
    private String brand;
    private String os;
    private double price;

    public static void staticMethod(){
        System.out.println("--- Static Method ---");
    }

    public Computer(){
        System.out.println("Computer Constructor : no-args");
        brand="UnknownBrand";
        os= "UnknownOS";
        price=0.0;
    }

    public Computer(String brand, String os, double price){
        System.out.println("Computer Constructor : with 3 args");
        this.brand = brand;
        this.os = os;
        this.price=price;
    }

    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", os='" + os + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

package day40_custom_classes;

public class CarGurus {
    public static void main(String[] args) {
        Car acura = new Car();
        acura.model= "Acura ILX";
        acura.price= 28150.0;
        acura.color= "white";
        acura.year= 2020;

        acura.drive();
        acura.showPrice();

        Car bmw = new Car();
        bmw.model = "BMW 5 Series 530ix";
        bmw.price= 51115.0;
        bmw.color="Black";
        bmw.year= 2019;

        bmw.drive();
        bmw.showPrice();

        Car porsche = new Car();
        porsche.setCarInfo("Poresche 911", 127753, "Silver", 2020);
        porsche.drive();
        porsche.showPrice();

        Car toyota = new Car();
        toyota.setCarInfo("Prius", 21452.0, "Gray", 2019);
        System.out.println("toyota.model = " + toyota.model);
        System.out.println("toyota.price = " + toyota.price);
        System.out.println("toyota.color = " + toyota.color);
        System.out.println("toyota.year = " + toyota.year);

        acura.getCarInfo();
        bmw.getCarInfo();
        porsche.getCarInfo();
        toyota.getCarInfo();


    }
}

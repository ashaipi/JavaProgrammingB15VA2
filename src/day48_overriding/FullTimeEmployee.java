package day48_overriding;

public class FullTimeEmployee extends Employee{
    @Override
    public void calculatePay(int hours, double rate) {
        System.out.println("Full Time Employee total pay: " + ((hours * rate) + 200 ));
        super.calculatePay(40,50);
    }
}

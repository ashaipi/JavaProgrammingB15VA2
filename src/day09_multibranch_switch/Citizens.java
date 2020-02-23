package day09_multibranch_switch;

public class Citizens {
    public static void main(String[] args) {
        int age=35;
        String citizenType=null;

        if(age >= 65) citizenType="Senior";
        else          citizenType="Non-Senior";

        System.out.println("Citizen Type is "+citizenType);

    }
}

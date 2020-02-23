package day35_wrapper_classes;

public class ApartmentLease {
    public static void main(String[] args) {
        applyForApartment(666);
        applyForApartment(999);
        applyForApartment(350);
    }

    public static void applyForApartment(int creditScore){
        /*
        creditScore -> 650 - 850 - call  qualify
        creditScore < 650        - call notQualify
         */
        if(creditScore>=650 && creditScore<=850) qualify();
        else if(creditScore<650) notQualify();
        else System.out.println("ERROR: Credit Score over or less than the credit limit");
    }

    public static void qualify(){
        System.out.println("Congratulations, your application for apartment is approved");
    }

    public static void notQualify(){
        System.out.println("Unfortunately, your application for apartment is denied");
    }
}

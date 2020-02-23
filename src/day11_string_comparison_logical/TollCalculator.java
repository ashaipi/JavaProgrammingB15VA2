package day11_string_comparison_logical;

public class TollCalculator {
    public static void main(String[] args) {
        String vehicleType = "car";
        boolean isRushHour = true;
        double tollPrice = 0.0;
        /*
        car and no rush hour 3.0
        car and rush hour 7.5
        truck and no rush hour 4.75
        truck and rush hour 11.5
        else-vehicle nor recognized, use a different road
         */

        if(vehicleType.equalsIgnoreCase("car") && !isRushHour){
            tollPrice=3.0;
            System.out.println("Vehicle type: "+vehicleType+". Non-Rush hour");
        }else if(vehicleType.equalsIgnoreCase("car") && isRushHour){
            tollPrice=7.5;
            System.out.println("Vehicle type: "+vehicleType+". Rush hour");
        }else if(vehicleType.equalsIgnoreCase("truck") && !isRushHour){
            tollPrice=4.75;
            System.out.println("Vehicle type: "+vehicleType+". Non-Rush hour");
        }else if(vehicleType.equalsIgnoreCase("truck") && isRushHour){
            tollPrice=11.5;
            System.out.println("Vehicle type: "+vehicleType+". Rush hour");
        }else
            System.out.println("vehicle nor recognized, use a different road");

        System.out.println("Toll cost: "+tollPrice);

    }
}

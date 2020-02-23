package day10_switch_logical_operators;

public class SpeedingCheck {
    public static void main(String[] args) {
        int speedLimit=55, currentSpeed= 96;

        if(currentSpeed>90)      System.out.println("Jail Time");
        else if(currentSpeed>80) System.out.printf("Reckless Driving");
        else if(currentSpeed>70) System.out.printf("Speeding Ticket and points");
        else if(currentSpeed>60) System.out.printf("Warning");
        else                     System.out.printf("keep driving and thinking Java");

    }
}

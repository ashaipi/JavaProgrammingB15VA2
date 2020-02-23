package day41_encapsulation;

public class CybertekBuilding {
    public static void main(String[] args) {
        Elevator elevatorOne = new Elevator();
        //elevatorOne.currentFloor=3;
        elevatorOne.gotoFloor(5);
        elevatorOne.gotoFloor(5);
        elevatorOne.gotoFloor(1);
        elevatorOne.gotoFloor(6);
        elevatorOne.gotoFloor(0);
        elevatorOne.gotoFloor(7);
        //System.out.println("--> You still in floor "+elevatorOne.currentFloor);
        elevatorOne.gotoFloor(-1);
        //System.out.println("--> You still in floor "+elevatorOne.currentFloor);

        ;


    }
}

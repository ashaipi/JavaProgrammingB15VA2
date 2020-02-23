package day41_encapsulation;

public class Elevator {
    // floors 0,1,2,3,4,5,6
    private int currentFloor;
    public void gotoFloor(int newFloor){
        System.out.println("---- You are in floor "+currentFloor+" goint to floor "+newFloor+" ----");
        if(newFloor>=0 && newFloor<=6){
            if(currentFloor>newFloor)
                for (int i = currentFloor-1; i >= newFloor ; i--)
                    System.out.println("going down to floor "+i);
            else if(currentFloor<newFloor){
                for (int i = currentFloor+1; i <= newFloor ; i++)
                    System.out.println("going up to floor "+i);
            }else System.out.println("You are in same floor "+currentFloor);
        }else {System.out.println("ERROR: Wrong floor selected: "+newFloor); return;}
        currentFloor = newFloor;
    }
}

package day34_methodspractice;

public class WarmUpMethods {
    public static void main(String[] args) {
        login("student@cybertek.com", "cybertekb15");
        login("STUDENT@cybertek.com", "cybertekb15");
        login("ashaipi@yahoo.com", "cybertekb15");
        login("student@cybertek.com", "ashaipi123");
        login("ashaipi@yahoo.com", "ashaipi123");
        drive("TOYOTA", 200);
        drive("Tesla",140);
        drive("BMW",-10);

    }

    public static void drive(String car, int speed){

        if(speed<0) System.out.println("Invalid Speed, cannot be negative");
        else if(speed==0)   System.out.println(car+" is not moving at 0 speed");
        else if(speed<=55)  System.out.println(car+" is driving at "+speed+" mph");
        else if(speed<200)  System.out.println(car+" is speeding at "+speed+" mph");
        else if(speed>=200) System.out.println(car+" is flying at "+speed+" mph");

    }

    public static void login(String userName, String password){
        //student@cybertek.com
        //cybertekb15
        if(userName.equalsIgnoreCase("student@cybertek.com") && password.equals("cybertekb15"))
            System.out.println("Login Successful, Welcome to Cybertek!");
        else System.out.println("ERROR: Login Failed - Invalid credentials!");
    }
}
